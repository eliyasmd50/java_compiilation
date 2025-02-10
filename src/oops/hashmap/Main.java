package oops.hashmap;

import java.util.HashMap;


// Hash Map in java
// we can store as a key value pair in hashmap
// It will be return as a Object
// key value can be any type 


public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        // we can store the value using put method with key value parameters
        capitals.put("India", "Delhi");
        capitals.put("America", "New YORK");
        capitals.put("south korea", "Soel");
        System.out.println(capitals);

        // we can get the values using get() method by give the key as an arguments
        System.out.println(capitals.get("south korea"));

        // we can remove pair by using remove() giving key as a paramaeter
        capitals.remove("America");
        System.out.println(capitals);

        // to remove all the elemnts in the hashmap use clear()
        capitals.clear();
        System.out.println(capitals);// {}
    }
}
