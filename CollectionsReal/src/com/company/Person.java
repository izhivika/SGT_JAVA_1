package com.company;

public class Person {
    // Define the attributes of a person
    private String name;
    private int age;


    public Person() {};
    // Define constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Define getters and setters
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
}
