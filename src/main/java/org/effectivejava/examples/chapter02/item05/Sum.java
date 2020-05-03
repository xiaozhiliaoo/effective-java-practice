package org.effectivejava.examples.chapter02.item05;

public class Sum {
    // Hideously slow program! Can you spot the object creation?
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        longSum();
        System.out.println(System.currentTimeMillis() - l);
        long l2 = System.currentTimeMillis();
        longObjectSum();
        System.out.println(System.currentTimeMillis() - l2);

    }

    private static void longSum() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void longObjectSum() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
