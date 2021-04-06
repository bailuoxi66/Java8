package com.example.stream2;

import java.util.*;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/3/23 12:55 下午
 * @description
 */

public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nih", "hello", "world", "welcome");

        //字符串升序
        //Collections.sort(list);
        //字符串长度升序
        //Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
        //字符串长度降序
        //Collections.sort(list, (item1, item2) -> item2.length() - item1.length());

        //字符串长度升序,方法引用
        //Collections.sort(list, Comparator.comparing(String::length));

        //如下，编译器不能自动推断出来类型，编译器认为是Obj，但是Obj没有length方法
        //Collections.sort(list, Comparator.comparingInt(item -> item.length()).reversed());

        //Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
        //其上面语句的本质就是list调用sort方法
        //list.sort(Comparator.comparingInt(String::length).reversed());
        //list.sort(Comparator.comparingInt((String item) -> item.length()).reversed());

        //Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        Collections.sort(list, Comparator.comparingInt(String::length).
//                thenComparing(Comparator.comparing(String::toLowerCase)));
//        Collections.sort(list, Comparator.comparingInt(String::length).
//                thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));
        System.out.println(list);
    }
}
