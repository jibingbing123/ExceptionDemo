package com.error.assertDemo;

/**
 * 断言
 * Created by jibingbing on 2018/1/29.
 */
public class AssertTest {
    public int divide(int a,int b){
        assert b!=0 : "除数不能为0";
        return a/b;
    }

    public static void main(String[] args) {
        AssertTest assertTest = new AssertTest();
        System.out.println(assertTest.divide(3,0));
    }
}
