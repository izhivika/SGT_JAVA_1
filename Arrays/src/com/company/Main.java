package com.company;

public class Main {

    public static void main(String[] args) {
	    // An array is a data type that allows you to save
        // multiple values of the same data-type in a particular memory location.

        // Two ways to create an array variable in Java.
        int[] ages = {12, 15, 18, 19};  // 1. Manually enter the value yourself.
        String[] names = new String[4];  // 2. Create a new instance and give it a size.
//        System.out.println(ages.length);
//        System.out.println(ages[0]);
        // The last item if any array in Java is always its length - 1

        double average = 0;
        double sum = 0;

        for(int i = 0; i < ages.length; i++) {
    //        System.out.println(ages[i]);
            sum += ages[i];
    //        System.out.println(sum);
        }
        average = sum / ages.length;
//        System.out.println(average);

        names[0] = "Ann";
        names[1] = "Lana";
        names[2] = "Paris";
        names[3] = "Jane";  // {null, null, null, "Jane"}
//        System.out.println(names[3]);

        String bunchOfNames = "";
        for (int i = 0; i < names.length; i++) {
            bunchOfNames += names[i] + " ";
        }
//        System.out.println(bunchOfNames);

        // Loop through and print out only the even numbers
        // e.g.
        // Even Number: 96
        // [13, 45, 26, 22, 19, 24, 28, 30, 90, 12]

        int[] numbers = {13, 45, 26, 22, 19, 24, 28, 30, 90, 12};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
//                System.out.println("Even Number: " + numbers[i]);
            }
        }

        // twoDimArray = [[13, 45], [26, 22], [1, 2], [3, 2], [30, 90]]
        // twoDimArray[0][1] is 45
        int[][] twoDimArray = {{13, 45}, {26, 22}, {1, 2}, {3, 2}, {30, 90}};
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.println(twoDimArray[i][j]);
            }
        }
    }
}
