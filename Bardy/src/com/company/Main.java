package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*	    // Assuming we had a car brand called Bardy.
        // Create an object of this class and make it extend another class called Car.
        // Car features include: noOfTires, color.
        // Create another class called Person.
        // Features of person include: name, age, likesBardy, hasBardy, bardiesOwned(ArrayList).
        // In the main method create a list that will contain the number of people,
        // and if a person likes Bardy and does not have Bardy, then give them a Bardy.

        List<Bardy> lotteryBardies = new ArrayList<>();
        lotteryBardies.add(new Bardy(4, "black", 4, false));
        lotteryBardies.add(new Bardy(4, "red", 4, false));
        lotteryBardies.add(new Bardy(4, "orange", 2, true));
        lotteryBardies.add(new Bardy(4, "yellow", 4, false));
        lotteryBardies.add(new Bardy(4, "blue", 2, true));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Fred", 34, true, true));
        personList.add(new Person("Wilma", 20, true, false));
        personList.add(new Person("Shaggy", 28, false, false));
        personList.add(new Person("Carly", 29, false,false));
        personList.add(new Person("Dan", 30, true, false));

        // Loop through and if you encounter a person who like Bardy and doesn't have one,
        // then give a random Bardy from the list above

        for (Person person : personList) {
            List<Bardy> bardiesOwned = new ArrayList<>();
            if (person.isLikesBardy() && person.isHasBardy()) {
                // If the person likes Bardy and has one then we give them one
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setBardiesOwned(bardiesOwned);
            } else if (person.isLikesBardy() && !person.isHasBardy()) {
                // If the person likes Bardy and does to have a Bardy
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setHasBardy(true);
                person.setBardiesOwned(bardiesOwned);
            }
        }

        for (Person person : personList) {
            if (person.isHasBardy()) {
                System.out.println(person.getName() + " has this " + person.getBardiesOwned().get(0).getColor() + " Bardy");
            }
        }*/

        // Queue
        // A queue is a collection interface that allows us to implement FIFO and LIFO.
        // FIFO - First-In-First-Out.
        // LIFO - Last-In-First-Out.
        Queue<String> names = new LinkedList<>();
        Queue<String> people = new LinkedList<>();
        names.offer("Josh");
        names.offer("Harry");
        names.offer("David");
        names.offer("George");
        //System.out.println(names.element()); // Returns an element from the front of the queue
        //System.out.println(people.peek()); // Does the same thing as the element() method
        // but doesn't throw an error on an empty queue.
        names.remove(); // Removes an item from the front of the queue.
        names.poll(); // Does the same thing as the remove method, except
        // it doesn't throw an error when faced with an empty queue.

        // The deque is a collection interface that allows us to manipulate items
        // to the top and bottom of the deque
        Deque<String> names1 = new ArrayDeque<>();
        names1.addFirst("Josh"); // offerFirst();
        names1.add("Dave"); // offer();
        names1.addLast("Paul"); // offerLast();
        //System.out.println(names1);

        // Maps
        // A map is a collection interface that affords us a key-value pair relationship
        // in a data structure.

        // HashMap returns the keys in a random format,
        // doesn't really care how you entered them
        // and doesn't bother to organise them.

        // TreeMap organises the keys in the natural ascending order
        // (irrespectively of how they were added),
        // meaning strings are returned in alphabetic order
        // and numbers are returned in ascending order.

        // LinkedHashMap saves the manner in which items are added
        // and returns them in that particular order.


        Map<String, String> countries = new LinkedHashMap<>();
        // Use the put() method to the Map interface to add a new item to the map
        countries.put("Nigeria", "Abuja");
        countries.put("USA", "Washington D.C.");
        countries.put("China", "Beijing");
        countries.put("Japan", "Tokyo");

        for (String country : countries.keySet()) {
            //System.out.println("The capital of " + country + " is " + countries.get(country));
        }

        //System.out.println(countries.keySet());
        //System.out.println(countries.values());

        // Task 1: 10 mins
        // Write a program that uses a map to uniquely categorise animals
        // and the sounds they make.
        Map<String, String> animalSounds = new HashMap<>();
        animalSounds.put("cat", "meow");
        animalSounds.put("dog", "woof");
        animalSounds.put("cow", "moo");
        animalSounds.put("sheep", "baa");
        animalSounds.put("snake", "hiss");

        for (String animal : animalSounds.keySet()) {
            System.out.println("The " + animal + " says " + animalSounds.get(animal) + "!");
        }

        System.out.println();

        // Task 2: 10 mins
        // Write a program that uses a map to uniquely categorise wild animals
        // and the names for their kids.
        Map<String, String> animalKids = new HashMap<>();
        animalKids.put("cat", "kitten");
        animalKids.put("dog", "puppy");
        animalKids.put("cow", "cattle");
        animalKids.put("sheep", "lamb");
        animalKids.put("snake", "snakelet");

        for (String animal : animalKids.keySet()) {
            System.out.println("The kid of a " + animal + " is a " + animalKids.get(animal));
        }

    }

    public static int getRandomIndex(List<Bardy> objectList) {
        return (int) (Math.random() * objectList.size()); // generate a random number
    }

}
