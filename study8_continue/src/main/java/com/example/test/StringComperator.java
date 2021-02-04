package com.example.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/5 1:00 上午
 * @description
 */

public class StringComperator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangzu");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

//        Collections.sort(names, (String o1, String o2) -> {
//            return o2.compareTo(o1);
//        });

        // expression o2.compareTo(o1)
        // statement {return o2.compareTo(o1);}
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

        //Collections.sort(names, Comparator.reverseOrder());

        System.out.println(names);
    }
}
