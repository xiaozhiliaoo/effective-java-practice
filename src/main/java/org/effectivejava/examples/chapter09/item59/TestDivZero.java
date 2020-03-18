package org.effectivejava.examples.chapter09.item59;

/**
 * Created by lili on 2017/7/2.
 */
public class TestDivZero {
    public static void main(String[] args) {

        int i = 0;
        try {
            i = 1/0;
            System.out.println(1111111);
        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("======================");
//            System.out.println(e.toString());
        }
        System.out.println(i);
    }
}
