package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Write a program that implements formula using recursion.
        // nCr = n!/(n-r)!r!
        // Create a method called factorial
        // to find the factorial of a number entered as a parameter.
        // Return the value.

        //System.out.println(factorial(3, 4));


        // Create a class called Person. The should have:
        // name, age.
        // Create a class called Employee. This class should inherit
        // the Person class and should have the extra field of
        // company id, company name.
        // Create a class called Company. This class should
        // take in employees as an array attribute, name.
        // In your main method populate a company's employee attribute and
        // find the average age of the employees.

        Employee[] javaEmployees = {
                new Employee("George", 35, "J12", "Microsoft"),
                new Employee("Dana", 29, "H15", "Microsoft"),
                new Employee("Harry", 28, "U23", "Microsoft")
        };

        Employee[] javaScriptEmployees = {
                new Employee("Nathan", 31, "I91", "Google"),
                new Employee("Jane", 42, "A22", "Google"),
                new Employee("Jordan", 28, "U23", "Google")
        };

        Company microsoft = new Company("Microsoft", javaEmployees);
        Company google = new Company("Google", javaScriptEmployees);

        //System.out.println("The average age of Microsoft employees is " + microsoft.average());
        //System.out.println("The average age of Google employees is " + google.average());
        System.out.println(google.getEmployee().getName());
    }

    public static int factorial(int n, int r) {
        // nCr = n!/(n-r)!r!
        //    fact1 fact2 fact3
        int fact1 = fact(n);
        int fact2 = fact(n - r);
        int fact3 = fact(r);
        return fact1 / fact2 * fact3;
    }

    public static int fact(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
