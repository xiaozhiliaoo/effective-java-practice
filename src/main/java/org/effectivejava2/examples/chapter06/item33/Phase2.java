package org.effectivejava2.examples.chapter06.item33;

/**
 * Created by lili on 2017/6/30.
 */
public enum  Phase2 {
    SOLID, LIQUID, GAS;
    public enum Transition2{
        MELT,FREEZE,BOIL,CONDENSE,SUBLIME,DEPOSIT;
        private static final Transition2[][] TRANSITION2={
            {null,MELT,SUBLIME},
            {FREEZE,null,BOIL},
            {DEPOSIT,CONDENSE,null}
        };

        public static Transition2 from(Phase2 src,Phase dst){
            return TRANSITION2[src.ordinal()][dst.ordinal()];
        }
    }

}
