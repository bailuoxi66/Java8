package com.example.MethodReference;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/10 12:02 下午
 * @description
 */

public class StudentComparator {

    public int compareStudentByScore(Student s1, Student s2){
        return s1.getScore() - s2.getScore();
    }
    public int compareStudentByName(Student s1, Student s2){
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
