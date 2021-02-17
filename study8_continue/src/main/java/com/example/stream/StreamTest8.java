package com.example.stream;

import java.util.stream.IntStream;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/17 7:12 下午
 * @description
 */

public class StreamTest8 {
    public static void main(String[] args) {
        //如下这种写法，经过dis后，没有达到limit的要求，所以不会退出
        //IntStream.iterate(0, item -> (item+1)%2).distinct().limit(6).forEach(System.out::println);

        //这种方式就可以解决问题了
        IntStream.iterate(0, item -> (item+1)%2).limit(6).distinct().forEach(System.out::println);
    }
}
