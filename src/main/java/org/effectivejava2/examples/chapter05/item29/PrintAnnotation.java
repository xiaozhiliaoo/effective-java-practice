// Use of asSubclass to safely cast to a bounded type token - Page 146
package org.effectivejava2.examples.chapter05.item29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class PrintAnnotation {
	// Use of asSubclass to safely cast to a bounded type token
	static Annotation getAnnotation(AnnotatedElement element,
			String annotationTypeName) {
		Class<?> annotationType = null; // Unbounded type token
//		Class<? extends Annotation> annotationType2 = null;
		try {
			annotationType = Class.forName(annotationTypeName);
//			annotationType2 = Class.forName(annotationType2);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex);
		}
		return element.getAnnotation(annotationType.asSubclass(Annotation.class));
	}

	// Test program to print named annotation of named class
	// Usage:org.effectivejava.examples.chapter05.item29.NullTest org.effectivejava.examples.chapter05.item29.CheckNull
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java PrintAnnotation <class> <annotation>");
			System.exit(1);
		}
		String className = args[0];
		String annotationTypeName = args[1];
		Class<?> klass = Class.forName(className);
		//为什么传入Class，参数却是AnnotatedElement，Class继承了AnnotatedElement接口
		System.out.println(getAnnotation(klass, annotationTypeName));
	}
}
