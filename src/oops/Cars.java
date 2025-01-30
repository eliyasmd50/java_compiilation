package oops;

public class Cars {
    
    // full throttle
    public void fullThrottle() {
        System.out.println("My car is going in full speed");
    }

    // Speed of the car
    public void speed (int maxSpeed) {
        System.out.println("Max speed of the car now is : " + maxSpeed + "KM");
    }

    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.fullThrottle();
        cars.speed(225);
    }
}
