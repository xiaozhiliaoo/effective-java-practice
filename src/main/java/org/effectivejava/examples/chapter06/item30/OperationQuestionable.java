package org.effectivejava.examples.chapter06.item30;

/**
 * Created by lili on 2017/6/30.
 */
public enum OperationQuestionable {
    PLUS,MINUS,TIMES,DIVIDE;

    double apply(double x,double y){
        switch (this){
            case PLUS:return x+y;
            case MINUS:return x-y;
            case TIMES:return x*y;
            case DIVIDE:return x/y;
        }
        throw new AssertionError("Unknown op:" + this);
    }
}
