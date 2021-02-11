package com.example.defaultMethod;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/11 11:05 上午
 * @description
 */

public interface MyInterface2 {
    default void MyMethod(){
        System.out.println("my interface2");
    }
}
