package com.example.defaultMethod;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/11 11:02 上午
 * @description
 */

public class MyClass implements MyInterface1, MyInterface2{

    @Override
    public void MyMethod() {
        MyInterface2.super.MyMethod();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        //继承来自于接口的默认方法
        myClass.MyMethod();
    }
}
