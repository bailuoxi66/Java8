package com.example.test;

import java.util.function.Predicate;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/8 12:24 下午
 * @description
 */

public class PredictTest {

    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println(predicate.test("hello"));
    }
}
