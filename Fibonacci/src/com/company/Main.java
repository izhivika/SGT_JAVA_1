package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assignment
        // Write a program that takes a value from the user and
        // prints out that number's position in fibonacci sequence.
        // Fibonacci sequence is a series of numbers where the previous two numbers sum up
        // to make the next number.
        // In this case, take the first two numbers of the sequence to be 1, 1
        // e.g. 1, 1, 2, 3, 5, 8, ...
        // Enter the position you want: 4
        // 3

/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position you want: ");
        int n = scanner.nextInt();
        System.out.println("The number in the Fibonacci sequence on this position is " + fib(n));

 */

        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 0;

        for (int i = 2; i < upperLimit; i++) {
            currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
        }

        System.out.println(currentNumber);

    }

    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1)
                + fib(n - 2);
    }

}
