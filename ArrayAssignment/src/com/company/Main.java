package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write a program that can count the number of vowels in a string and return
        // an interactive response.

        // { a, e, i, o, u }
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String apple = "watermelon";
        // 1. Change apple to char array.
        // 2. Loop through apple.

        char[] appleArray = apple.toCharArray();
        int vowelCounter = 0;
//        for (int i = 0; i < appleArray.length; i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (appleArray[i] == vowels[j]) {
//                    vowelCounter++;
//                    break;
//                }
//            }
//        }

        // In arrays .length is a field, but in strings, .length is a
        // method, so you have to add parentheses after it
//        for (int i = 0; i < apple.length(); i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (apple.charAt(i) == vowels[j]) {
//                    vowelCounter++;
//                    break
//                }
//            }
//        }

        // switch
        // 1. Loop through the string.
        // 2. Use a switch to evaluate the current value of the string/ the current character.
        // 3. Increase vowel counter by one for each vowel we encounter.
        // 4. Output the result.
        for (int i = 0; i < apple.length(); i++) {
            switch (apple.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCounter++;
                    break;
            }
        }
        System.out.println("The number of vowels in " + apple + " is " + vowelCounter);
    }
}
