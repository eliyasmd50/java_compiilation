package oops.collections;

import java.util.ArrayList;
import java.util.Collections;

// Collections in Java it will sort the elemnts Alphabetically or numerically

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Rolls");
        cars.add("Audi");
        cars.add("Maruthi");
        cars.add("Kia");
        System.out.println(cars);// [Rolls, Audi, Maruthi, Kia]

        // Collections in Array Sorting in Ascending order
        Collections.sort(cars); // Since it is a String it will sort based on the ALphapbetical
        System.out.println(cars); // [Audi, Kia, Maruthi, Rolls]

        // Doing String Array Sorting in Descending Order
        Collections.sort(cars, Collections.reverseOrder()); // descending order
        System.out.println(cars);
    }
}

class NumbersSorting {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(23);
        myNumbers.add(21);
        myNumbers.add(18);
        myNumbers.add(6);
        myNumbers.add(19);
        myNumbers.add(27);
        System.out.println(myNumbers);// [23, 21, 18, 6, 19, 27]

        // Sorting numbers using Collection Class
        Collections.sort(myNumbers); // Ascending Order
        System.out.println(myNumbers); // [6, 18, 19, 21, 23, 27]

        // Number ArrayList Sorting in Descending order
        Collections.sort(myNumbers, Collections.reverseOrder()); // Descending Order
        System.out.println(myNumbers);
    }
}
