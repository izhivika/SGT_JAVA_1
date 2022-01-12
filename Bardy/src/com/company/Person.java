package com.company;

import java.util.List;

public class Person {

    // Define the properties of the person
    private String name;
    private int age;
    private boolean likesBardy;
    private boolean hasBardy;
    private List<Bardy> bardiesOwned;

    // Define the constructor
    public Person(String name, int age, boolean likesBardy, boolean hasBardy) {
        this.name = name;
        this.age = age;
        this.likesBardy = likesBardy;
        this.hasBardy = hasBardy;
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

    public boolean isLikesBardy() {
        return likesBardy;
    }

    public void setLikesBardy(boolean likesBardy) {
        this.likesBardy = likesBardy;
    }

    public boolean isHasBardy() {
        return hasBardy;
    }

    public void setHasBardy(boolean hasBardy) {
        this.hasBardy = hasBardy;
    }

    public List<Bardy> getBardiesOwned() {
        return bardiesOwned;
    }

    public void setBardiesOwned(List<Bardy> bardiesOwned) {
        this.bardiesOwned = bardiesOwned;
    }
}
