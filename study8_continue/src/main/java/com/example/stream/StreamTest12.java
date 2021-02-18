package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/18 2:01 下午
 * @description
 */

public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hi", "hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");

        List<String> collect = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
