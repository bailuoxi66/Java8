package com.example.test;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/8 3:13 下午
 * @description
 */

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
        System.out.println(binaryOperatorTest.compute(1, 2, (v1, v2) -> v1 + v2));

        System.out.println(binaryOperatorTest.getShort("hello123", "word", (v1, v2) -> v1.length() - v2.length()));
        System.out.println(binaryOperatorTest.getShort("hello123", "world", (v1, v2) -> v1.charAt(0) - v2.charAt(0)));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
