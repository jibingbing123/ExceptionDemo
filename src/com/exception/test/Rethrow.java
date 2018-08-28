package com.exception.test;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/01/29
 **/
public class Rethrow {
    public static void g() throws Exception{
        System.out.println("Originate from g()");
        throw new Exception("throw from g()");
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("Caught in main");
            e.printStackTrace();
            throw new NullPointerException("from main");
        }
    }
}
