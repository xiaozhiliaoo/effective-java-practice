package org.effectivejava.examples.chapter09.item59;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by lili on 2017/7/2.
 */
public class UncheckMethodThrow {


    public static void readFile(String path) {
        try {
            FileOutputStream outputStream =new  FileOutputStream(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readFile2(String path) throws FileNotFoundException {
            FileOutputStream outputStream =new  FileOutputStream(new File(path));

    }
    public static void readFile3Part1(String path) throws FileNotFoundException {

            FileOutputStream outputStream =new  FileOutputStream(new File(path));

    }
    public static void readFile3Part2(String path) throws CloneNotSupportedException {


    }
    public static void readFile3Part3(String path) throws NullPointerException{


    }

    public static void readFile3() throws FileNotFoundException, CloneNotSupportedException {
        readFile3Part1("/");
        readFile3Part2("/");
        readFile3Part3("/");
    }

    public static void main(String[] args) {
        readFile("////");


        try {
            readFile2("/////");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //NullPointerException 空指针异常属于运行时异常，不需要抛出来
        try {
            readFile3();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
