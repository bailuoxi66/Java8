package com.example.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/8 1:15 下午
 * @description
 */

public class PredictTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        PredictTest2 predictTest = new PredictTest2();
        predictTest.conditionFilter(list, value -> value%2 == 0);
        predictTest.conditionFilter(list, value -> true);
        System.out.println("----------------------");
        predictTest.conditionFilter2(list, value -> value>5, value -> value%2 == 0);
        //尤为重要，需要特殊理解下
        System.out.println(predictTest.isEqual("test").test("test"));
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for(Integer integer:list){
            if(predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2){
        for (Integer integer:list){
            if(predicate1.or(predicate2).test(integer)){
                System.out.println(integer);
            }
        }
    }

    public Predicate<String> isEqual(String str){
        return Predicate.isEqual(str);
    }
}
