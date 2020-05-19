package org.effectivejava3.chapter2.item2.hierarchicalbuilder;


import static org.effectivejava3.chapter2.item2.hierarchicalbuilder.NyPizza.Size.SMALL;
import static org.effectivejava3.chapter2.item2.hierarchicalbuilder.Pizza.Topping.HAM;
import static org.effectivejava3.chapter2.item2.hierarchicalbuilder.Pizza.Topping.SAUSAGE;

// Using the hierarchical builder (Page 16)
public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
