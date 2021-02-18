package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/18 2:15 下午
 * @description
 */

public class StreamTest13 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 30, 40);
        Student s2 = new Student("lisi", 40, 50);
        Student s3 = new Student("zhaowu", 50, 60);
        Student s4 = new Student("zhangsan", 40, 90);

        List<Student> list = Arrays.asList(s1, s2, s3, s4);
//        Map<String, List<Student>> collect =
//                list.stream().collect(Collectors.groupingBy(Student::getName));

        //分组
        //Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

//        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Student::getName,
//                Collectors.averagingDouble(Student::getScore)));

        //分区
        Map<Boolean, List<Student>> collect = list.stream().collect(Collectors.groupingBy(student ->
                student.getScore() >= 90));
        System.out.println(collect);
    }
}
