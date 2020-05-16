package org.effectivejava3;

import javafx.print.Collation;

import java.sql.Date;
import java.util.Collections;
import java.util.WeakHashMap;

/**
 * @author lili
 * @date 2020/5/15 23:38
 * @description
 * @notes
 */
public class Main {
    public static void main(String[] args) {
//        Date.from
//        StackWalk
//        Collections.list
        WeakHashMap<String,String> map= new WeakHashMap<>();
        map.put("1","2");
        map.put("2","2");
        map.put("3","2");
        System.out.println(map);
        System.gc();
        System.gc();
        System.out.println(map);
    }
}
