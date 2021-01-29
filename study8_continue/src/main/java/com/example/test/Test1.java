package com.example.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/1/29 2:40 下午
 * @description
 */

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("===========");
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("============");

        //使用匿名内部类，可以替换成lambda
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //lambda表达式处理问题
        list.forEach(integer -> System.out.println(integer));
    }
}
