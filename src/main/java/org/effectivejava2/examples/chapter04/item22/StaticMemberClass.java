package org.effectivejava2.examples.chapter04.item22;

/**
 * Created by lili on 2017/6/29.
 */
public  class StaticMemberClass {
    private static int id;
    private String name;
    public static int add(){
        return id;
    }

    public  class A{
        public  int adddd(){
            return id;
        }
    }
}
