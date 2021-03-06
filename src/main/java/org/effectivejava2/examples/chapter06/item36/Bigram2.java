package org.effectivejava2.examples.chapter06.item36;

/**
 * Created by lili on 2017/6/30.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 双字母组
 */
public class Bigram2 {
    private final char first;
    private final char second;

    public Bigram2(char first, char second) {
        this.first = first;
        this.second = second;
    }


    public boolean equals(Bigram2 obj) {
        return obj.first == this.first && obj.second == this.second;
    }

    public int hashCode(){
        return 31*first+second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<Bigram>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram(ch, ch));
        System.out.println(s.size());
        //output 260
    }
}
