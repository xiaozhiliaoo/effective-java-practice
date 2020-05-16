package org.effectivejava2.examples.chapter10.item70;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lili
 * @date 2020/5/2 12:18
 * @description
 * @notes
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Object, Object> maps = Collections.synchronizedMap(new HashMap<>());
        Set<Object> objects = maps.keySet();
        synchronized (objects) {
            for (Object k : objects) {

            }
        }

    }
}
