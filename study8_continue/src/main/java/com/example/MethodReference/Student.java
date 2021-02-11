package com.example.MethodReference;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/10 11:29 上午
 * @description
 */

public class Student {
    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public static int CompareByScore(Student s1, Student s2){
        return s1.getScore() - s2.getScore();
    }

    public static int CompareByName(Student s1, Student s2){
        return s1.getName().compareToIgnoreCase(s2.getName());
    }

    public int compareByScore(Student s1){
        return this.getScore() - s1.getScore();
    }

    public int compareByName(Student s1){
        return this.getName().compareToIgnoreCase(s1.getName());
    }
}
