package com.example.Collector;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;
//这里采用静态导入的方式

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/18 3:14 下午
 * @description
 */

public class StreamTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 90);
        Student s2 = new Student("lisi", 80);
        Student s3 = new Student("wangwu", 70);
        Student s4 = new Student("zhaoliu", 100);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);
        List<Student> st1 = students.stream().collect(toList());
        st1.forEach(System.out::println);

        System.out.println("---------------");
        System.out.println("count:" + students.stream().collect(counting()));
        System.out.println("count:" + students.stream().count());

        //collect是stream所提供的一个方法
        //collect：收集器
        //Collector作为collect方法的参数，同时也是一个接口，是一个可变的汇聚操作，将输入元素累计到一个可变的结果容器中；
        //它会在所有元素都处理完毕后，将累计结果转化为一个最终的表示（这是一个可选操作）；它支持串形和并行两种方式执行。
        //Collectors本身提供了关于Collector的常见汇聚操作，Collectors实际上本身是一个工厂
    }
}
