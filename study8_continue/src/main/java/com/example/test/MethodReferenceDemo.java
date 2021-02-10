package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/10 11:14 上午
 * @description
 */

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello, world");
//        list.forEach(value -> System.out.println(value));

        list.forEach(System.out::println);
    }
}
