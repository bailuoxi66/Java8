package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/17 7:04 下午
 * @description
 */

public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloWorld");

//        list.stream().map(item -> item.substring(0, 1).toUpperCase(Locale.ROOT) + item.substring(1)).
//                forEach(System.out::println);

        //如下map只是一个单纯的中间操作，根据lazy行为
        list.stream().map(item ->
                {
                    String result =  item.substring(0, 1).toUpperCase(Locale.ROOT) + item.substring(1);
                    System.out.println("test");
                    return result;
                });
    }
}
