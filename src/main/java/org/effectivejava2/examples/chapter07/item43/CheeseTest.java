package org.effectivejava2.examples.chapter07.item43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lili on 2017/7/2.
 */
class Cheese{


    private int quant;//数量
    private int time;//发货时间

    public Cheese(int quant, int time) {
        this.quant = quant;
        this.time = time;
    }

    public Cheese(){
        this(0,0);
    }

    @Override
    public String toString() {
        return "quant:"+this.quant+", time:"+this.time;
    }

    private final List<Cheese> cheeseInStock = new ArrayList<>();

    public  void prepareStock(){
        cheeseInStock.add(new Cheese(1,111));
        cheeseInStock.add(new Cheese(2,222));
        cheeseInStock.add(new Cheese(3,333));
    }

    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public Cheese[] getCheeses(){
        return cheeseInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    public List<Cheese> getCheeseList(){
        if(cheeseInStock.isEmpty()){
            return Collections.emptyList();
        }else{
            return new ArrayList<Cheese>(cheeseInStock);
        }
    }
}


public class CheeseTest {

    public static void main(String[] args) {

        Cheese c = new Cheese();
//        c.prepareStock();
        System.out.println(Arrays.toString(c.getCheeses()));
        System.out.println(c.getCheeseList());









    }

}
