package oops.arraylist;

import java.util.ArrayList;
import java.util.Collections;

// Here we are declaring the ArrayList in Java
// In a Normal Array we can't able to change the size of the Array once decalred
// In ArrayList we can add and remove the Array based on the Data Types


// Add Elements in Array
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Maruti 800");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Fortuner");
        cars.add(1, "Honda"); // we can specify the exact index in the addition of an Array
        System.out.println(cars);
    }
}

// Access the element in an ArrayList
class AccessElementInArray {
    public static void main(String[] args) {
        ArrayList<String> bikes = new ArrayList<String>();
        // adding some items to access it
        bikes.add("GT650");
        bikes.add("Enticier");

        // access the elemnt using index values of an array
        System.out.println(bikes.get(0));
        System.out.println(bikes.get(1));
    }
}

// to change the element or set the element of an Arraylist
class ChangeAnItem {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Jhon");
        studentNames.add("doe");
        System.out.println("Before Changes : " + studentNames);

        // changing the elements in the ArrayList
        studentNames.set(0, "Mark");
        System.out.println("After Changes : " + studentNames);
    }
}

// Remove an Element in an Array
class RemoveAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayElements = new ArrayList<>();
        arrayElements.add(1);
        arrayElements.add(2);
        arrayElements.add(3);
        arrayElements.add(2);

        System.out.println("Before Removal" + arrayElements);

        // Removing a particular element in an ArrayList using index
        arrayElements.remove(3);
        System.out.println("After Removal" + arrayElements);

        //Removing or clearing all th elements in an Array List
        arrayElements.clear();
        System.out.println("Clearing all th elements" + arrayElements);

    }
}

// Loop through in an ArrayList
class LoopThroughArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myValues = new ArrayList<>();

        // adding values to the ArrayList
        myValues.add(1);
        myValues.add(2);
        myValues.add(3);
        myValues.add(4);
        myValues.add(5);
        myValues.add(6);
        myValues.add(7);

        System.out.println("Values before iterating" + myValues);

        //for Loop through to the Array we have to know the size of the array
        int len = myValues.size(); // to get the length of the ArrayList

        // iterating now
        for(int i=0; i< len; i++) {
            System.out.println(myValues.get(i));
        }

        System.out.println("For Seperation");

        // loop through using for-each 
        for(int j : myValues) {
            System.out.println(j);
        }
        
    }
}

// Other types in the ArrayList
class OtherTypes {
    public static void main(String[] args) {
        ArrayList<Character> alphabets = new ArrayList<>();
        alphabets.add('a');
        alphabets.add('b');
        alphabets.add('c');
        alphabets.add('d');
        alphabets.add('e');
        System.out.println(alphabets);
        for (Character character : alphabets) {
            System.out.println(character);
        }
    }
}

//ArrayList Sorting
class SortingAnArray {
    public static void main(String[] args) {
        ArrayList<String> freedomYears = new ArrayList<>();
        freedomYears.add("Subhash");
        freedomYears.add("Gandhi");
        freedomYears.add("Nehru");
        System.out.println("Before sorting "+freedomYears);
        Collections.sort(freedomYears); // sorting freedomYears
        System.out.println("After sorting "+freedomYears);
    }
}

// Sorting Numbers using collections
class SortingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> myIntValues = new ArrayList<>();
        myIntValues.add(23);
        myIntValues.add(10);
        myIntValues.add(76);
        myIntValues.add(45);
        myIntValues.add(34);
        myIntValues.add(8);
        myIntValues.add(27);

        System.out.println("Values before Sorting" + myIntValues);
        Collections.sort(myIntValues);// sorting the numbers
        System.out.println("Values After Sorting" + myIntValues);
    }
}