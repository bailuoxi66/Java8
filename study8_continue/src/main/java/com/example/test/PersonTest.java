package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/8 10:57 上午
 * @description
 */

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangshan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3= new Person("wangwu", 40);

        List<Person> personList = Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();

//        List<Person> p1 = personTest.getPersonByUserName("zhangshan", personList);
//        p1.forEach(person -> System.out.println(person.getUsername()));
//
//        List<Person> p2 = personTest.getPersonByAge(20, personList);
//        p2.forEach(person -> System.out.println(person.getAge()));
//
//        List<Person> p3 = personTest.getPersonByAge2(20, personList);
//        p3.forEach(person -> System.out.println(person.getAge()));

        List<Person> p4 = personTest.getPersonAge3(20, personList, (ages, persons) ->
            persons.stream().filter(person -> person.getAge()>20).collect(Collectors.toList())
        );
        p4.forEach(person -> System.out.println(person.getAge()));

    }

    public List<Person> getPersonByUserName(String username, List<Person> personList){
        return personList.stream().filter(person -> person.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(Integer age, List<Person> personList){
        return personList.stream().filter(person -> person.getAge() > age)
                .collect(Collectors.toList());
    }

    public List<Person> getPersonByAge2(Integer age, List<Person> personList){
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personListPerson) -> {
            return personListPerson.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, personList);
    }

    public List<Person> getPersonAge3(Integer age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> biFunction){
        return biFunction.apply(age, personList);
    }
}
