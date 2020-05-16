// Same bug as NestIteration.java (but different symptom)!! - Page 213
package org.effectivejava2.examples.chapter08.item46;

import java.util.Arrays;
import java.util.Collection;

enum Face {
	ONE, TWO, THREE, FOUR, FIVE, SIX
}

public class DiceRolls {
	public static void main(String[] args) {
		Collection<Face> faces = Arrays.asList(Face.values());

		/*for (Iterator<Face> i = faces.iterator(); i.hasNext();)
			for (Iterator<Face> j = faces.iterator(); j.hasNext();)
				System.out.println(i.next() + " " + j.next());*/

		/*for (Iterator<Face> i = faces.iterator(); i.hasNext();) {
			Face face = i.next();
			for (Iterator<Face> j = faces.iterator(); j.hasNext(); ) {
				System.out.println(face+ " " + j.next());
			}
		}*/
		// Preferred idiom for nested iteration on collections and arrays
		 for (Face face1 : faces) {
			 for (Face face2 : faces) {
				 System.out.println(face1 + " " + face2);
			 }
		 }
	}
}
