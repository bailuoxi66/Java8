package com.example.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/16 11:03 上午
 * @description
 */

public class StreamTest4 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("hello", "world", "hello world");
//
//        String[] stringArray = stream.toArray(length -> new String[length]);
//
//        //方式二
//        String[] strings = stream.toArray(String[]::new);
//
//        //数组没有foreach方法，集合有，但是stringArray不是一个集合，List是集合
//        //可以通过如下方式将数组转化为集合
//        Arrays.asList(stringArray).forEach(System.out::println);

//        Stream<String> stream = Stream.of("hello", "world", "hello world");
//        //List<String> list = stream.collect(Collectors.toList());
//        //List<String> list = stream.collect(() -> new ArrayList(), (theList, item) -> theList.add(item),(theList1, theList2) -> theList1.addAll(theList2));
//
//        List<String> list = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
//        list.forEach(System.out::println);

        Stream<String> stream = Stream.of("hello", "world", "hello world");
//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);

        //将stream转化成set
//        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set.getClass());
//        set.forEach(System.out::println);

        //将stream转化成string
        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
