package org.effectivejava.examples.chapter05.item29;

/**
 * Created by lili on 2017/6/30.
 */
public class NullTest {

    @CheckNull(isNull = "null")
    public void test(){

    }

    @CheckNull
    public void test2(){

    }
}
