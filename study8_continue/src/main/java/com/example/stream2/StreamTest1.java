package com.example.stream2;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/3/15 12:42 下午
 * @description
 */

public class StreamTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 80);
        Student s2 = new Student("lisi", 90);
        Student s3 = new Student("wangwu", 60);
        Student s4 = new Student("zhaoliu", 100);
        Student s5 = new Student("zhaoliu", 90);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
        List<Student> students1 = students.stream().collect(toList());   //这里调整为静态导入
        students1.forEach(System.out::println);
        System.out.println("-------------");

        System.out.println("count:" + students.stream().collect(counting()));
        System.out.println("count:" + students.stream().count());

        students.stream().collect(minBy(Comparator.comparing(Student::getScore))).ifPresent(System.out::println);
        students.stream().collect(maxBy(Comparator.comparing(Student::getScore))).ifPresent(System.out::println);
        System.out.println(students.stream().collect(averagingInt(Student::getScore)));
        System.out.println(students.stream().collect(summarizingInt(Student::getScore)));
        System.out.println("-------------");

        System.out.println(students.stream().map(Student::getName).collect(joining()));
        System.out.println(students.stream().map(Student::getName).collect(joining(",")));
        System.out.println(students.stream().map(Student::getName).collect(joining(",", "<begin> ", " <end>")));

        System.out.println(students.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName))));

        System.out.println(students.stream().collect(partitioningBy(student -> student.getScore() > 80)));

        Map<String, Student> collect = students.stream().
                collect(groupingBy(Student::getName, collectingAndThen(minBy(Comparator.comparing(Student::getScore)), Optional::get)));
        System.out.println(collect);
    }
}
