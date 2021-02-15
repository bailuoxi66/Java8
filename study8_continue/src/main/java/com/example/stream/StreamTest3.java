package com.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/15 12:02 下午
 * @description
 */

public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        System.out.println(list.stream().map(integer -> integer * 2).reduce(0, Integer::sum));
    }
}
