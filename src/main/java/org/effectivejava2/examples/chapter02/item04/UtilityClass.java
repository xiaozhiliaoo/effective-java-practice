// Noninstantiable utility class
package org.effectivejava2.examples.chapter02.item04;

public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		throw new AssertionError();
	}
}
