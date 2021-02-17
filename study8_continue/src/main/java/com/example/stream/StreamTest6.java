package com.example.stream;

import java.util.IntSummaryStatistics;
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
        //Stream.iterate(1, item -> item+2).limit(6).forEach(System.out::println);

        Stream<Integer> limit = Stream.iterate(1, item -> item + 2).limit(6);
        //sum返回一个值，max/min返回一个值的包装（optional），本质上取决于值是否可能为空
        //System.out.println(limit.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max());
        //limit.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max().ifPresent(System.out::println);


//        IntSummaryStatistics intSummaryStatistics = limit.filter(item -> item > 2).
//                mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
//        System.out.println(intSummaryStatistics.getCount());
//        System.out.println(intSummaryStatistics.getSum());

        //一旦流被操作或者关闭了，下次就不允许使用了
//        System.out.println(limit);
//        System.out.println(limit.filter(item -> item >2));
//        //这里使用重复stream，会引发异常
//        System.out.println(limit.distinct());
        //注意stream的每一次操作都会生成新的stream
        System.out.println(limit);
        Stream<Integer> integerStream = limit.filter(item -> item > 2);
        System.out.println(integerStream);
        Stream<Integer> distinct = integerStream.distinct();
        System.out.println(distinct);
    }
}
