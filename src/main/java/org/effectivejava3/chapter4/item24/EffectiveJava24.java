package org.effectivejava3.chapter4.item24;

/**
 * @author lili
 * @date 2020/10/25 23:50
 * @notes
 */
public class EffectiveJava24 {

    protected EffectiveJava24() {}


    private int i;

    private static int j;

    public int getI() {
        return i;
    }

    static class InnerStaticClass {

        public void test() {
            System.out.println(j);
        }
    }


    class InnerInstanceClass {

        public void test() {


            EffectiveJava24.this.getI();
            System.out.println(i);
            System.out.println(getI());
        }
    }
}
