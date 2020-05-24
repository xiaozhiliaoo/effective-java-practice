package org.example;

import java.math.BigInteger;

/**
 * @author lili
 * @date 2020/5/23 16:37
 * @description
 * @implNote
 * @notes
 */
public class B {

    /**
     *
     * @implSpec
     * @apiNote
     * @implNote
     * @param args
     */
    public static void main(String[] args) {
        BigInteger i = BigInteger.valueOf(1000000000000000000l);
        BigInteger j = BigInteger.valueOf(1000000000000000000l);
        BigInteger k = BigInteger.valueOf(9000000000000000000l);

        System.out.println(i.modPow(j, k));
    }
}
