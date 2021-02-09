package com.example.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/9 3:42 下午
 * @description
 */

public class OptionTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();
        employee.setName("zhangsan");
        employee1.setName("lisi");

        Company company = new Company();
        company.setName("company");
        List<Employee> employees = Arrays.asList(employee, employee1);
        company.setEmployees(employees);

        List<Employee> list = company.getEmployees();
        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(theCompany -> theCompany.getEmployees()).
                orElse(Collections.emptyList()));
    }

    //Optional没有实现序列化，不建议被当作参数或者field
    public void test(Optional optional){

    }
}
