package com.example.test;

import java.util.function.Function;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/5 1:22 上午
 * @description
 */

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(1, value -> {
            return 2 * value;
        }));
        System.out.println(functionTest.compute(2, value -> 5 + value));

        System.out.println(functionTest.convert(5, value -> String.valueOf(value + "hello, world")));
    }

    public int compute(int a, Function<Integer, Integer> function){
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function){
        return function.apply(a);
    }
}
