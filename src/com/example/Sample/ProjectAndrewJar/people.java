package com.example.Sample.ProjectAndrewJar;

public class people implements Comparable<people> {
    private String name;
    private int age;

    public people(String name, int age) {
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
    public String toString() {
        return "FirstName: "+this.name;
    }

    @Override
    public int compareTo(people pp) {
        return this.name.compareTo(pp.getName());
    }
}
