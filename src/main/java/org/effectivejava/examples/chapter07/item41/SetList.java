// What does this program print? - Page 194
package org.effectivejava.examples.chapter07.item41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
			list2.add(i);
		}

		for (int i = 0; i < 3; i++) {
			set.remove(i);
			list.remove(i);
//			list2.remove((Integer) i);   //-3 -2 -1
			list2.remove(Integer.valueOf(i));

		}

		System.out.println(set);
		System.out.println(list);
		System.out.println(list2);
	}
}
