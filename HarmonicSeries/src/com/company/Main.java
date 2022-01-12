package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that takes a number n and calculates harmonic series from 1 to n
        // Harmonic series formula: 1 + 1/2 + 1/3 + 1/4 + 1/5 ... + 1/n

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int number = scanner.nextInt();
        double sum = 0;
        for (double i = 1; i <= number; i++) {
            sum += 1 / i;
        }
        System.out.print("The answer is: " + sum);
    }
}
