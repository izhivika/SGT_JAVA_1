package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1st Task: Loops.
        // Write a program that counts in descending order from 100 to 0;
        // Print out only the values that are divisible by 6.

/*        for (int i = 100; i >= 0; i--) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
 */
        // 2nd Task: Average.
        // Write a program that takes input from the user for 10 numbers
        // and finds the average those numbers.

/*        System.out.println("Please enter 10 numbers:");
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("The average of the entered numbers is " + sum / 10);
 */
        // 3rd Task: Strings.
        // Write a program that takes in 5 strings from the user
        // and concatenates those strings into one sentence.

/*        System.out.println("Please enter 5 strings:");
        String sentence = "";
        for (int i = 0; i < 5; i++) {
            sentence += scanner.next() + " ";
        }
        System.out.println("Your sentence is: " + sentence);
 */
        // 4th Task:
        // Write a program that takes in 10 numbers
        // and finds the largest number.

/*        System.out.println("Please enter 10 numbers: ");
        int largest = 0;
        for (int i = 0; i < 10; i ++) {
            int n = scanner.nextInt();
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println("The largest number is " + largest);
 */
        // 5th Task:
        // Using an array, output the number of odd numbers
        // out ot the numbers a user has entered, i.e.
        // allow the user to enter a number of numbers
        // and return or output the number of odd numbers.

/*        System.out.println("How many numbers do you want to enter?");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Please enter the numbers:");
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 != 0) {
                odd += 1;
            }
        }
        if (odd == 1) {
            System.out.println("There is 1 odd number");
        } else {
            System.out.println("There are " + odd + " odd numbers");
        }
 */
        // 6th Task:
        // Create a class called Vehicle

        Vehicle vehicle = new Vehicle();
        vehicle.setLengthOfVehicle(10);
        vehicle.setNoOfTires(4);
        vehicle.setNumberOfSeats(4);
        vehicle.setNameOfVehicle("Volkswagen");
        vehicle.setCurrentSpeed(50);
        vehicle.startEngine();
        System.out.println(vehicle.getCurrentSpeed());
        vehicle.stopEngine();
        System.out.println(vehicle.getCurrentSpeed());

    }
}

