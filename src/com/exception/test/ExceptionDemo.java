package com.exception.test;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by jibingbing on 2018/1/29.
 */
public class ExceptionDemo extends Base {

    //子类重写父类的方法,不能抛出比父类更多的异常,只能抛出与父类相同的异常或者父类异常的子类或者不抛出异常
    public static void amethod() {}

    public static void main(String[] args) throws IOException {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
    }

    protected ExceptionDemo() throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Pausing");
        din.readChar();
        System.out.println("Continuing");
        this.amethod();
    }
}
