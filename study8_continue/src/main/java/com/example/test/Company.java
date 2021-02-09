package com.example.test;

import java.util.List;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/9 3:37 下午
 * @description
 */

public class Company {
    private String name;
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
