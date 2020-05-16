// Emulated extensible enum using an interface - Basic implementation - Page 165
package org.effectivejava2.examples.chapter06.item34;

import java.util.Arrays;
import java.util.Collection;

public enum BasicOperation implements Operation {
	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		public double apply(double x, double y) {
			return x / y;
		}
	};
	private final String symbol;

	BasicOperation(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	// Test class to exercise all operations in "extension enum" - Page 167
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		test(BasicOperation.class, x, y);
		System.out.println(); // Print a blank line between tests
		test2(Arrays.asList(BasicOperation.values()), x, y);
	}

	// test parameter is a bounded type token (Item 29)
	private static <T extends Enum<T> & Operation> void test(Class<T> opSet,
															 double x, double y) {
		for (Operation op : opSet.getEnumConstants())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}

	// test parameter is a bounded wildcard type (Item 28)
	private static void test2(Collection<? extends Operation> opSet, double x,
							  double y) {
		for (Operation op : opSet)
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
}


