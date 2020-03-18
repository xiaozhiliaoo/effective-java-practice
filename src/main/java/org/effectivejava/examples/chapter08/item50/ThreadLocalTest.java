package org.effectivejava.examples.chapter08.item50;

/**
 * Created by lili on 2017/7/2.
 */
class ThreadLocal1{
    private ThreadLocal1(){};
    public static void set(String key,Object value){};
    public static Object get(String key){return  null;}
}

class ThreadLocal2{
    private ThreadLocal2(){};
    public static class Key{
        public Key() {
        }
    }
    public static Key getKey(){
        return new Key();
    }

    public static void set(Key key,Object value){};
    public static Object get(Key key){return  null;};

}

class ThreadLocal3<T>{
    public ThreadLocal3(){};
    public void set(T value){};
    public T get(){return  null;};
}


class ThreadLocal4{
    public ThreadLocal4(){};
    public void set(Object value){};
    public Object get(){return  null; };
}



public class ThreadLocalTest {
    ThreadLocal local;
//    TimerTask
}
