package com.company;

public class Student extends Person {

    // Define the features of a student
    private int score;

    // Define a constructor
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    // Define getter and setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
