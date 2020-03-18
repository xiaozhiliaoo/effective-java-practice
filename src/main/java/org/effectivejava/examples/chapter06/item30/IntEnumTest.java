package org.effectivejava.examples.chapter06.item30;

/**
 * Created by lili on 2017/6/30.
 */
public enum  IntEnumTest {
    SMALL(1),
    MIDDLE(5),
    BiG(10),
    LARGE(Integer.MAX_VALUE);

    private final int number;

    IntEnumTest(int number) {
        this.number = number;
    }

    public int val(){
        return number;
    }

    public static int value(String enumType){
        if(enumType.equals("SMALL")){
            return IntEnumTest.SMALL.val();
        }else if(enumType.equals("MIDDLE")){
            return IntEnumTest.MIDDLE.val();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(IntEnumTest.BiG);
        System.out.println(IntEnumTest.SMALL.val());
        System.out.println(IntEnumTest.value("MIDDLE"));
        for(IntEnumTest num:IntEnumTest.values()){
            System.out.println(num.val());
        }
    }
}
