package com.exception.test;

/**
 * @description: 习题5
 * @author: jibingbing
 * @create: 2018/01/29
 **/
public class ExercisesFive {

    public static void f() throws Exception{}

//    public static void g(){
//        try {
//            f();
//        } catch (Exception e) {
//            System.out.println("Caught in g()");
////            throw new Exception("throw form g()");
//        }
//    }

    public static void g() throws Throwable{
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g()");
            throw e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Throwable throwable) {
            System.out.println("Caught in main");
            throwable.printStackTrace();
        }
    }
}
