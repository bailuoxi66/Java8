package com.example.stream;

import java.util.stream.IntStream;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/14 12:17 下午
 * @description
 */

public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{3,5,6}).forEach(System.out::println);
        System.out.println("---------");
        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("---------");
        IntStream.rangeClosed(3, 8).forEach(System.out::println);
    }
}
