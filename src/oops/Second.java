package oops;

public class Second {
    public static void main(String[] args) {
        Main obj1 = new Main(); // calling the other class file in the different folder
        System.out.println(obj1.x);

        // creating the car instance to call it here
        Cars cars = new Cars();
        cars.fullThrottle(); // calling the methods of the Cars class
        cars.speed(250);
    }
}
