package org.effectivejava.examples.chapter10.item67;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lili
 * @date 2020/5/2 11:22
 * @description
 * @notes
 */
public class MapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
        c.put("1", "1");
        c.put("2", "2");
        c.put("3", "3");
        c.forEach((k, v) -> {
            System.out.println(k);
//            System.out.println(v);
            if (k.equals("3")) {
                c.remove("3");
            }
        });


        Map<String, String> c2 = new HashMap<>();
        c2.put("1", "1");
        c2.put("2", "2");
        c2.put("3", "3");
        c2.forEach((k, v) -> {
            System.out.println(k);
//            System.out.println(v);
            if (k.equals("3")) {
                c2.remove("3");
            }
        });
    }
}
