package org.effectivejava.examples.chapter07.item42;

import java.util.Arrays;

/**
 * Created by lili on 2017/7/2.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int [] digits = {3,1,4,1,5,9,2,6,5,4};
        System.out.println(digits);
        System.out.println(Arrays.asList(digits));
        System.out.println(Arrays.toString(digits));
    }
}
