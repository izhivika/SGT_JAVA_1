package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Set interface is used for unique elements.
        // (If you put in duplicates, they will be treated as one).
        // HashSet is an implementation of the set interface
        // that is not ordered, meaning there's no indexing
        // like we are used to in arrays.
        // Items created inside of a collection become objects.
        // HashSet randomizes the output.
/*
        Set<String> names = new HashSet<>();
        names.add("Bobby");
        names.add("Dave");
        names.add("Barry");
        names.add("Larry");

        Object[] theNames = names.toArray();
        System.out.println(theNames[0]);
        System.out.println(names.size()); // This is to get the number of elements in the collection.
        System.out.println(names.contains("David"));
        for (String name : names) {
            System.out.println(name);
        }
*/
/*        // The TreeSet has a built-in comparator that allows it to
        // sort items/elements/object in ascending order,
        // i.e., if the items are string, they will be sorted alphabetically,
        // and if the items are numbers, they will be sorted in ascending order.
        Set<Integer> names = new TreeSet<>(); //
        names.add(4);
        names.add(2);
        names.add(1);

        for (int name : names) {
            System.out.println(name);
        }
*/
/*
        // The LinkedHashSet is different from the others
        // in the sense that it preserved the order in which the items are added.
        // Meaning if an item is added first, then it will be returned first.
        // LinkedHashSet return the values as they are entered.
        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(4);
        nums.add(8);
        nums.add(3);

        for (int num : nums) {
            System.out.println(num);
        }
*/
/*
        // First Task:
        // Take in 6 numbers from the user and return the numbers
        // in a sorted manner using the set interface.
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a number: ");
            numbers.add(scanner.nextInt());
        }
        for (int number : numbers) {
            System.out.println(number);
        }
*/
/*
        // Second Task:
        // Take in 5 strings from the user and filter the duplicates using a hashset.
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a string: ");
            if (!strings.add(scanner.next())) {
                System.out.println("Duplicate encountered");
            }
        }
        System.out.println(strings);
*/
/*
        // Third Task:
        // Take in 10 names and return them in order the user entered them using a set.
        Set<String> names = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a name: ");
            names.add(scanner.next());
        }
        System.out.println(names);
*/
        // Assignment.
        // 1.
        // The employees assignment we did last time.
        // Solve it using an ArrayList.
        // Do a different solution with LinkedList.
        // Create a class called Person. The should have:
        // name, age.
        // Create a class called Employee. This class should inherit
        // the Person class and should have the extra field of
        // company id, company name.
        // Create a class called Company. This class should
        // take in employees as an array attribute, name.
        // In your main method populate a company's employee attribute and
        // find the average age of the employees.
        // 2.
        // Create a program that will hold 20 students' scores in an ArrayList
        // and return the maximum score in the ArrayList.
        // Add the numbers yourself without using input, but output interactively.
        /*ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            scores.add((int) (Math.random() * 11));
        }
        System.out.println("20 students' scores are: " + scores);
        System.out.println("The maximum score is " + Collections.max(scores));
*/
        /*String goog = "Google";
        String micro = "Microsoft";

        List<Employee> googleEmployees = new ArrayList<>();
        googleEmployees.add(new Employee("Darby", 33, "JUI", goog));
        googleEmployees.add(new Employee("Arthur", 22, "POI", goog));
        googleEmployees.add(new Employee("Henrietta", 32, "DED", goog));

        List<Employee> microsoftEmployees = new ArrayList<>();
        microsoftEmployees.add(new Employee("Yeshua", 31, "432", micro));
        microsoftEmployees.add(new Employee("Joshua", 28, "321", micro));
        microsoftEmployees.add(new Employee("Linda", 24, "213", micro));

        Company microsoft = new Company(microsoftEmployees, micro);
        Company google = new Company(googleEmployees, goog);

        System.out.println("The average age of employees in google is " + google.average());
        System.out.println("The average age of employees in microsoft is " + microsoft.average());
*/
/*
        // Hard-coding
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Dave", 19, 40));
        studentsList.add(new Student("Josh", 19, 43));
        studentsList.add(new Student("Barry", 19, 55));
        studentsList.add(new Student("Dave", 19, 33));
        studentsList.add(new Student("Dave", 19, 22));
        studentsList.add(new Student("Dave", 19, 49));
        studentsList.add(new Student("Dave", 19, 29));
        studentsList.add(new Student("Dave", 19, 33));
        studentsList.add(new Student("Dave", 19, 21));
        studentsList.add(new Student("Dave", 19, 22));
        studentsList.add(new Student("Dave", 19, 56));
        studentsList.add(new Student("Dave", 19, 34));
        studentsList.add(new Student("Dave", 19, 12));
        studentsList.add(new Student("Dave", 19, 59));
        studentsList.add(new Student("Dave", 19, 23));
        studentsList.add(new Student("Dave", 19, 22));
        studentsList.add(new Student("Dave", 19, 54));
        studentsList.add(new Student("Dave", 19, 56));
        studentsList.add(new Student("Dave", 19, 23));
        studentsList.add(new Student("Dave", 19, 44));
*/
        List<Student> studentsList = new ArrayList<>();
        // User-interactive
        // Initialize the scanner
        //Scanner scanner = new Scanner(System.in);

        // Prompt the user to find out how many students they want to add.
        System.out.print("How many students do you want to add?: ");
        int numberOfStudents = scanner.nextInt();

        // Populate the studentList with user input
        for (int i = 0; i < numberOfStudents; i++) {
            // Prompt the user for data
            System.out.print("Enter the name of the student: ");
            String name = scanner.next();

            System.out.print("Enter the age of the student: ");
            int age = scanner.nextInt();

            System.out.print("Enter the score of the student: ");
            int score = scanner.nextInt();

            // Add new student object to the student list.
            studentsList.add(new Student(name, age, score));
        }

        Student bestStudent = getMaximumScore(studentsList);

        System.out.println("The maximum score of the students is "
                + bestStudent.getScore()
                + " belonging to "
                + bestStudent.getName());
    }

    public static Student getMaximumScore(List<Student> students) {
        // Define a max variable to hold the maximum value
        // Assign the first element of the list to the max variable
        // in order compare it with subsequent values and ensure that the max value
        // from the object in question (array, list, etc.) is actually obtained.

        Student bestStudent = students.get(0);

        for (Student student : students) {
            if (bestStudent.getScore() < student.getScore()) {
                bestStudent = student;
            }
        } // maximum score found by the time the loop ends.
        return bestStudent;
    }

    // Assuming we had a car brand called Bardy.
    // Create an object of this class and make it extend another Class called Car.
    // Car features include: noOfTires, color.
    // Create another class called Person.
    // Features of person include: name, age, likesBardy, hasBardy, bardiesOwned(ArrayList).
    // In the main method create a list that will contain the number of people,
    // and if a person likes Bardy and does not have Bardy, then give them a Bardy.
}
