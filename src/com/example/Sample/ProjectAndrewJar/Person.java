package com.example.Sample.ProjectAndrewJar;

import java.util.LinkedList;
import java.util.List;

public class Person implements Comparable<Person>{

      private String name;
      private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person oMary) {
        return this.name.compareTo(oMary.getName());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
