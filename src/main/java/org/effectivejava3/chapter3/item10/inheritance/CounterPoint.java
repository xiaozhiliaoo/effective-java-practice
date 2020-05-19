package org.effectivejava3.chapter3.item10.inheritance;

import java.util.concurrent.atomic.*;
import org.effectivejava3.chapter3.item10.Color;
import org.effectivejava3.chapter3.item10.Point;
// Trivial subclass of Point - doesn't add a value component (Page 43)
public class CounterPoint extends Point {
    private static final AtomicInteger counter =
            new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }
    public static int numberCreated() { return counter.get(); }
}
