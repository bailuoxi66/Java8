package com.example.test;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/1/31 4:57 下午
 * @description
 */

public class Test2 {

    public void myTest(MyInterface myInterface){
        System.out.println("1");
        myInterface.test();
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        //传统方法实现
        test2.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("myInterface");
            }
        });
        System.out.println("=================");
        //lambda方法实现
        test2.myTest(() -> {
            System.out.println("myInterface");
        });

        System.out.println("=============");
        //MyInterface接口的实现
        MyInterface myInterface = () -> {
            System.out.println("hello");
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces().length);
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}
