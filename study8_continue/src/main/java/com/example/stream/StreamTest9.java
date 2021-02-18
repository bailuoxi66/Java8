package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/18 11:35 上午
 * @description
 */

public class StreamTest9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);

        for(int i=0; i<5000000; ++i){
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序");
        long startTime = System.nanoTime();   //纳秒级别
        list.stream().sorted().count();
        long endTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("排序耗时：" + millis);

        //stream 并行排序的效率
        System.out.println("1开始排序");
        long startTime1 = System.nanoTime();   //纳秒级别
        list.parallelStream().sorted().count();
        long endTime1 = System.nanoTime();
        long millis1 = TimeUnit.NANOSECONDS.toMillis(endTime1 - startTime1);
        System.out.println("1排序耗时：" + millis1);
    }
}
