package org.effectivejava.examples.chapter05.item25;

import java.util.List;

public class Reduction2 {
    static <E> E reduce(List<E> list, Function<E> f, E initVal){
        E[] snapshot = (E[]) list.toArray();
        E result = initVal;
        for(E e:snapshot){
            result = f.apply(result,e);
        }
        return result;
    }
}
