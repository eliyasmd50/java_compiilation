package oops.linkedlist;

import java.util.LinkedList;

// LinkedList class in java is almost identical with ArrayList class
// we can use all the methods same as like ArrayList eg: add, remove, set, get, clear

public class Main {
    public static void main(String[] args) {

        // here we can see i can perform all the methods similar to ArrayList

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Swaraj");
        cars.add("Mazda");
        cars.add("Swift");
        cars.add("Dezire");
        System.out.println(cars); //[Swaraj, Mazda, Swift, Dezire]

        //remove method
        cars.remove(1);
        System.out.println(cars); //[Swaraj, Swift, Dezire]

        //set method
        cars.set(2, "Hyundai"); // [Swaraj, Swift, Hyundai]
        System.out.println(cars);

        // get method
        for(int i = 0; i< cars.size(); i++) {
            System.out.println(cars.get(i)); // iterate through all the elements
        }

        // clear method
        cars.clear();
        System.out.println(cars);// []

    }
}


// Eventhough Linked List is same as like ArrayList it has its own way of built
// ArrayList is commonly used to storing and Accessing the elements
// Linked List is commonly used for manipulating the elements in the List 

// Some other common methods in the linked list 
class CommonMethods {
    public static void main(String[] args) {
        
        // Defining the Linked List
        LinkedList<Character> alphabets = new LinkedList<>();

        System.out.println(alphabets); // []

        // addFirst() adds an item in the beggining of the list
        alphabets.addFirst('A');
        System.out.println(alphabets);// [A]

        // addLast() this method adds an item at end of the list
        alphabets.addLast('Z');
        System.out.println(alphabets); // [A, Z]

        //getFirst() get the value of the first element
        System.out.println(alphabets.getFirst()); // A returns as a just the type of the lement not as a array

        // getLast() get the value of the last element
        System.out.println(alphabets.getLast());// get the last element of the list as just the value
     
        // removeFirst() removes the first element of the list
        // if we are trying to get the value of the removed element it will give the value of it
        char removedFirstAlphabet = alphabets.removeFirst();
        System.out.println(removedFirstAlphabet); // A
        System.out.println(alphabets); // [Z]

        // removeLast() removes the last element of the list
        char removedLastAlphabet = alphabets.removeLast();
        System.out.println(removedLastAlphabet); // Z
        System.out.println(alphabets); // []
    }
}