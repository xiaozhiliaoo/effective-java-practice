package org.effectivejava2.examples.chapter04.item19;

import static org.effectivejava2.examples.chapter04.item19.PhysicalConstants.AVOGADROS_NUMBER;

/**
 * Created by lili on 2017/6/29.
 */
public class Test {
    double atoms(double mols){
        return AVOGADROS_NUMBER*mols;
    }
}
