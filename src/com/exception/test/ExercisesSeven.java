package com.exception.test;

/**
 * @description: try{}代码块中捕获到异常后,不再执行下一句代码
 * @author: jibingbing
 * @create: 2018/01/29
 **/
public class ExercisesSeven {

    public static void problem() throws Exception{
        throw new Exception("problem throw Exception");
    }

    public static void trythis(){
        try {
            System.out.println("1");
            problem();
        } catch (RuntimeException e1) {
            System.out.println("2");
            return;
        } catch (Exception e) {
            System.out.println("3");
            return;
        } finally {
            System.out.println("4");
        }
        System.out.println("5");
    }

    public static void main(String[] args) {
        trythis();
    }
}
