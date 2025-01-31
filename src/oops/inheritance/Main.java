package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        System.out.println("Cars Model : "+ toyota.model);
        System.out.println("Cars model Year : "+toyota.year);
        System.out.println("Starting the car");
        toyota.startVehicle();
    }
}
