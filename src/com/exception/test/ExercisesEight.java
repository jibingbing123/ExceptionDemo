package com.exception.test;

/**
 * @description: catch()语句必须跟在try后
 * @author: jibingbing
 * @create: 2018/01/29
 **/
public class ExercisesEight {
    public void foo(){
        try {
            bar();
        } catch (MyException e){

        } finally {
            baz();
        }

//        } catch (MyException e) {}
    }

    public void bar() throws MyException {
        throw new MyException();
    }

    public void baz() throws RuntimeException {
        throw new RuntimeException();
    }
}
