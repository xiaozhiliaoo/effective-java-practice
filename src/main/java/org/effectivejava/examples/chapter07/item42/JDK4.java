package org.effectivejava.examples.chapter07.item42;

import java.util.ArrayList;

/**
 * 模拟suspect方法
 */
class A{
    static int suspect1(Object[] args){
        System.out.println(args);
        return 1;
    }

    static int suspect2(Object... args){
        System.out.println(args);
        return 1;
    }

    static <T>int suspect3(T... args){
        System.out.println(args);
        return 1;
    }
}


public class JDK4 {
    public static void main(String[] args) {
        int [] digits = {3,1,4,1,5,9,2,6,5,4};
        String[] s = {"11","22","33"};
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        System.out.println(list);
        System.out.println(new ArrayList<>().add(1));
//        A.suspect1(digits);
//        System.out.println(digits);
//        System.out.println(s);
//        A.suspect1(s);
        A.suspect2(digits);
        A.suspect3(digits);
    }

}
