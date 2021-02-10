package com.example.MethodReference;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/10 11:42 上午
 * @description
 */

public class MethodReferenceTest {
    public static void main(String[] args) {
        Student s1 = new Student("zhangshan", 10);
        Student s2 = new Student("lisi", 50);
        Student s3 = new Student("wangwu", 90);
        Student s4 = new Student("zhaoliu", 40);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);
        //list新增sort排序，返回值为void，说明是原地排序
        //students.sort((st1, st2) -> Student.CompareByScore(st1, st2));
        //students.forEach(student -> System.out.println(student.getScore()));

        //使用方法引用一，跟上面是等价的（因为对于sort而言，里面的consumer函数式接口是接受两个参数返回一个int，而当前的静态方法正是如此）
        //students.sort(Student::CompareByScore);
        //students.forEach(student -> System.out.println(student.getScore()));


        StudentComparator studentComparator = new StudentComparator();
        //students.sort((st1, st2) -> studentComparator.compareStudentByScore(st1, st2));
        //students.forEach(student -> System.out.println(student.getScore()));

        //使用方法引用二，引用名（对象名）：：实例方法名
        students.sort(studentComparator::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));

    }
}
