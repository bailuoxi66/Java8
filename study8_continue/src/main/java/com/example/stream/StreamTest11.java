package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/18 1:37 下午
 * @description
 */

public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "world hello",
                "hello world hello", "hello world");
        System.out.println(list);
        List<String[]> collect = list.stream().map(item -> item.split(" ")).distinct().collect(Collectors.toList());
        //如下的Arrays.asList是将item重新构造成集合
        collect.forEach(item -> Arrays.asList(item).forEach(System.out::println));

        System.out.println(list);
        //Stream<String[]>  ->  Stream[String].需要有一个打平的过程。从而应用后续的distinct
        List<String> collect1 = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct()
                .collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }
}
