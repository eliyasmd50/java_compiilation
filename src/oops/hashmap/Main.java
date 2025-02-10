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

        // to find out the size fo the hash Map use size() method
        System.out.println(capitals.size()); // 3

        // Loop through within hash map using keySet and values

        // below we are using the keyset to loop through
        for(String i : capitals.keySet()) {
            System.out.println(i);
        }

        // Below we are using the values to loop through 
        for (String i : capitals.values()) {
            System.out.println(i);
        }

        // to pring bothkey and values
        for(String i : capitals.keySet()){
            System.out.println("Keys:" + i + " Values " + capitals.get(i));
        }

        // we can remove pair by using remove() giving key as a paramaeter
        capitals.remove("America");
        System.out.println(capitals);

        // to remove all the elemnts in the hashmap use clear()
        capitals.clear();
        System.out.println(capitals);// {}
    }
}

// This is for Name and Age Mapping in the Key value pair using HashMap

class OtherTypesInHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Jhon", 25);
        people.put("Doe", 26);
        people.put("Mike", 28);

        for(String i : people.keySet()) {
            System.out.println("Key : " + i + " , Values: " + people.get(i));
        }
    }
}