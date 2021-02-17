package com.example.stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/17 11:34 上午
 * @description
 */

public class StreamTest6 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        //下述有问题，因为findFirst（）是一个optional
//        //System.out.println(stream.findFirst().get());
//
//        //可以避免stream为空的情况
//        stream.findFirst().ifPresent(System.out::println);

        //无限流和limit配合使用
        Stream.iterate(1, item -> item+2).limit(6).forEach(System.out::println);
    }
}
