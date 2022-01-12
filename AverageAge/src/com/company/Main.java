package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Write a program that takes in the value of 8 children's
        // ages in an array,
        // and finds the average of those 8 kids
        // Enter age: ...
        // The average of the 8 kids' age is: ...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of kids: ");
        int[] ages = new int[scanner.nextInt()];
        double sum = 0;
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            ages[i] = age;
            sum += age;
        }
        double average = sum / ages.length;
        System.out.println("The average of the " + ages.length + " kids' ages is: " + average);

        // Write a program that takes a set of values as an array
        // print out the values as a string like this [3, 5, 6, 3, 4]
        // make it as interactive as possible
    }
}
