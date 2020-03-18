package org.effectivejava.examples.chapter04.item21;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by lili on 2017/6/29.
 */
public class Host {

    private static class StrLenCmp implements Comparator<String>,Serializable{

        @Override
        public int compare(String s1, String s2) {
            return s1.length()-s2.length();
        }
    }

    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();

}
