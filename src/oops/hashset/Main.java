package oops.hashset;

import java.util.HashSet;

// Hashset in java
// in Java hashset is a collection of items where every items is unique

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("RollsRoyce");
        cars.add("BMW");
        cars.add("AUDI");
        cars.add("AUDI");
        cars.add("AUDI");
        System.out.println(cars);//[Rolls Royce, Volvo, AUDI, BMW] returns array of items

        // to chec k if an item exists in a collection we can use contains() method
        System.out.println(cars.contains("BMW")); // true

        // to remove an item we can use remove() method
        cars.remove("Volvo");
        System.out.println(cars);// [AUDI, BMW, RollsRoyce] returns after removing the item

        // loop through to the hashset items
        for (String  i: cars) {
            System.out.println(i);
        }

        // to get the size of an Array
        System.out.println(cars.size());

        // to clear out all the value in the Hashset
        cars.clear();
        System.out.println(cars);
    }
}

class IntegerTypeHashSet {
    public static void main(String[] args) {
        HashSet<Integer> myNum = new HashSet<>();
        myNum.add(2);
        myNum.add(4);
        myNum.add(8);
        myNum.add(2);
        System.out.println(myNum);// [2,4,8] gives only the unique values

        // doing a for each loop to find out the numbers which has the values of 
        for (int i = 0; i< 10; i++) {
            if(myNum.contains(i)) {
                System.out.println(i + " was found in the Set");
            } else {
                System.out.println(i + " was not found in the Set");
            }
        }
    }
}