package org.effectivejava2.examples.chapter07.item40;

/**
 * Created by lili on 2017/6/30.
 */

/**
 * 不对和书上例子不一样  添加KELVIN还要重写newInstance方法
 * P164
 */
public class Thermometer {//温度计

    enum TemperatureScale{//温标
        FAHRENHEIT,//华氏的
        CELSIUS;//摄氏的;


        TemperatureScale() {

        }
    }

    private Thermometer(TemperatureScale scale) {
        System.out.println(scale);
    }

    public static Thermometer newInstance(TemperatureScale scale) {
        
        if(scale == TemperatureScale.CELSIUS){
            return new Thermometer(TemperatureScale.CELSIUS);
        }else if(scale == TemperatureScale.FAHRENHEIT){
            return new Thermometer(TemperatureScale.FAHRENHEIT);
        }
        return null;
    }

    @Override
    public int hashCode() {
        //org.effectivejava.examples.chapter07.item40.Thermometer@2b67
        // 2b67 == 11111
        return 11111;
    }

    public static void main(String[] args) {
        System.out.println(Thermometer.newInstance(TemperatureScale.CELSIUS));
    }
}
