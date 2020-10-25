package org.example;


import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * @author lili
 * @date 2020/10/20 1:08
 * @notes
 */
public class ServiceLoaderTest {

    @Test
    public void test() {
        ServiceLoader<Map> load = ServiceLoader.load(Map.class);
        Iterator<Map> iterator = load.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
}
