package com.org.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepakvalechha on 04/06/17.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(45));
        personList.add(new Person(40));
        personList.add(new Person(35));

        int maxAge = personList.stream().map(p -> p.getAge()).reduce(0, Integer::max);
        System.out.println(maxAge);
    }
}
 class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

