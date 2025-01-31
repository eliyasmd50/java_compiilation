package oops;

public class Cars {
    int modelYear;
    String modelName;

    // Multiple parameter constructor defining
    public Cars(int year, String model) {
        modelYear = year;
        modelName = model;
    }
    
    // full throttle
    public void fullThrottle() {
        System.out.println("My car is going in full speed");
    }

    // Speed of the car
    public void speed (int maxSpeed) {
        System.out.println("Max speed of the car now is : " + maxSpeed + "KM");
    }

    public static void main(String[] args) {
        Cars cars = new Cars(2025, "Audi"); // assigniig the value of multiple input based on the constructor parameter defined
        cars.fullThrottle();
        cars.speed(225);
        System.out.println("car Model Name: " + cars.modelName + ", year : " + cars.modelYear);
    }
}
