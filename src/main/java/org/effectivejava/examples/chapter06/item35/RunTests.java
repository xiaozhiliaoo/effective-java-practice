// Program to process marker annotations - Page 171
package org.effectivejava.examples.chapter06.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
	public static void main(String[] args) throws Exception {
		//args[0]:org.effectivejava.examples.chapter06.item35.Sample
		//args[0]:org.effectivejava.examples.chapter06.item35.Sample2
		int tests = 0;
		int passed = 0;
		Class testClass = Class.forName(args[0]);
		for (Method m : testClass.getDeclaredMethods()) {
			/*Returns true if an annotation for the specified type is present
			on this element, else false. This method is designed primarily for
			convenient access to marker annotations.The truth value returned by
			this method is equivalent to: getAnnotation(annotationClass) != null*/
			if (m.isAnnotationPresent(Test.class)) {
				tests++;
				try {
					//m.invoke(new Sample()); //这里
					m.invoke(null);//这里对象为空，只能调用静态方法
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("INVALID @Test: " + m);
				}
			}

			// Array ExceptionTest processing code - Page 174
			if (m.isAnnotationPresent(ExceptionTest.class)) {
				tests++;
				try {
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (Throwable wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					Class<? extends Exception>[] excTypes = m.getAnnotation(
							ExceptionTest.class).value();
					int oldPassed = passed;
					for (Class<? extends Exception> excType : excTypes) {
						if (excType.isInstance(exc)) {
							passed++;
							break;
						}
					}
					if (passed == oldPassed)
						System.out.printf("Test %s failed: %s %n", m, exc);
				}
			}
		}

		/*Method[] methods = testClass.getDeclaredMethods();
		if(methods!=null && methods.length>0){
			for(Method m:methods){
				Test test = m.getAnnotation(Test.class);
				if(test==null){
					continue;
				}
				tests++;
				try {
					m.invoke(null);
					//m.invoke(new Sample());
					passed++;
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("INVALID @Test: " + m);
				}
			}
		}*/


		System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
	}
}
