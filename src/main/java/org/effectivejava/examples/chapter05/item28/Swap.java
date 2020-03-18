// Private helper method for wildcard capture - Pages 139-140
package org.effectivejava.examples.chapter05.item28;

import java.util.Arrays;
import java.util.List;

public class Swap {

//	public static <E> void swap(List<E> list,int i, int j){}


	public static void swap(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}

//	public static void swap2(List<?> list, int i, int j) {
//		list.set(i,list.set(j,list.get(i)));
//	}

	// Private helper method for wildcard capture
	private static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}

	public static void main(String[] args) {
		// Swap the first and last argument and print the resulting list
		List<String> argList = Arrays.asList(args);
		swap(argList, 0, argList.size() - 1);
		System.out.println(argList);
	}
}
