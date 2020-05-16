package org.effectivejava2.examples.chapter08.item49;

/**
 * Created by lili on 2017/7/2.
 */
public class LongTest {
    public static void main(String[] args) {
//        Long sum = 0L;
        long sum = 0L;//10倍的差距
        long timeStart = System.currentTimeMillis();
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-timeStart);
    }
}
