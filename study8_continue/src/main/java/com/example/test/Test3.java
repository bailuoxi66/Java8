package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/3 11:52 上午
 * @description
 */

public class Test3 {
    public static void main(String[] args) {
//        TheInterface1 t1 = () -> {};
//        TheInterface2 t2 = () -> {};
//        System.out.println(t1.getClass().getInterfaces()[0]);
//        System.out.println(t2.getClass().getInterfaces()[0]);

        //lambda表达式依赖于上下文，没有上下文lambda表达式的上下文无从得知的
        //函数式接口的抽象方法对lambda来说毫无意义，名字本身对于接口的实现来说还是很关键的
        //() -> {};

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach(item -> {
//            System.out.println(item.toUpperCase(Locale.ROOT));
//        });
//        List<String> list2 = new ArrayList<>();
//        list.forEach(item -> list2.add(item.toUpperCase(Locale.ROOT)));
//        list2.forEach(item -> System.out.println(ixtem));

        //如上并没有极大的消减代码的编写
        //lambda、stream、集合
        //lambda表达式
        list.stream().map(item -> item.toUpperCase(Locale.ROOT)).forEach(item -> System.out.println(item));
        //方法引用
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

        Function<String, String> function1 = String::toUpperCase;
        Function<String, String> function = item -> item.toUpperCase(Locale.ROOT);
        System.out.println(function.getClass().getInterfaces()[0]);
        System.out.println(function1.getClass().getInterfaces()[0]);
    }
}

@FunctionalInterface
interface TheInterface1{
    void myMethod1();
}

interface TheInterface2{
    void myMethod2();
}
