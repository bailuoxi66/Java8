package com.example.test;

import java.util.function.Supplier;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/8 2:25 下午
 * @description
 */

public class SupplierTest {
    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "hello, world";
//        System.out.println(supplier.get());

        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());

        //构造器引用
        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getName());
    }
}
