package org.effectivejava.examples.chapter05.item25;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lili on 2017/6/29.
 */
public class TestList {
    public static void main(String[] args) {
//        Object[] objectArray = new Long[1];
//        objectArray[0] = "I don't fit in";

        List<Long> ol  = new ArrayList<Long>();
        ol.add(1L);
//        ol.add("I don't fit in");

        //不可以创建泛型数组
//        List<String>[] stringLists = new List<String>[1];
//        List<Integer> intLists = Arrays.asList(42);
//        Object[] objects = stringLists;
//        objects[0] = intLists;
//        String s = stringLists[0].get(0);
        Object[] o = new Object[5];
        List<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        List<Integer> b = new ArrayList();
        b.add(1);
        b.add(2);
        o[0]=a;
        o[1]=b;
        System.out.println(o);

        //數組
        List[] o2 = new List[5];
        o2[0] = a;
        o2[1] = b;
        System.out.println(o2);
        //illegal
//        List<E>[] lists = new List<E>[];
//        E[] = new E[45];

    }
}
