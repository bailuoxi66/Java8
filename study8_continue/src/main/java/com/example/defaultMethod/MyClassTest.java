package com.example.defaultMethod;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/11 11:12 上午
 * @description
 */

public class MyClassTest extends MyInterface1Impl implements  MyInterface2{

    //从java规范里面认识：实现类的优先级高于接口默认方法，所以接口为实现类里面的方法实现
    public static void main(String[] args) {
        MyClassTest myClassTest = new MyClassTest();
        myClassTest.MyMethod();
    }
}
