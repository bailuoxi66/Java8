package com.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/18 11:44 上午
 * @description
 */

public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.stream().mapToInt(item -> item.length()).filter(length -> length == 5)
//                .findFirst().ifPresent(System.out::println);

        //请注意，stream是存在短路运算的，只要找到条件后续的就不会被执行
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
    }
}
