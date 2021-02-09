package com.example.test;

import java.util.Optional;

import static java.util.Optional.empty;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/8 4:51 下午
 * @description
 */

public class OptionalTest {
    public static void main(String[] args) {
//        Optional<String> optional = Optional.of("hello");
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
        //推荐的optional使用方式
        Optional<String> optional = Optional.of("hello");
        optional.ifPresent(item -> System.out.println(optional.get()));
        System.out.println(optional.orElse("world"));
        System.out.println("------");
        System.out.println(optional.orElseGet(() -> "nihaov"));

        //optional的出现，里面的方法都是基于函数式风格使用的，写法风格需要进行注意
    }
}
