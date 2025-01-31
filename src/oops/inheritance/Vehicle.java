package oops.inheritance;

class Vehicle {
    // declaring here will be called in the subclasses and it has its own class definition
    // this will be called in the sub class
    protected String model = "Toyota"; 
    public void startVehicle() {
        System.out.println("tuut, tuuut!!");
    }
}

class Car extends Vehicle {
    public int year = 2023; // defining Class Car own attributes
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();// here i just called the parent class and i just called my sub class in the main file for understanding
        vehicle.startVehicle();// just calling the method of parent class we can access the attributes of parent class since it is defined in protected
    }
    
}

// by defining the final keyword in the class it says that the Driver class is not inherited
final class Driver {
    public void drive() {
        System.out.println("driver is starting the vehicle");
    }
}


// in the below example we can see that the driver cannot be extended since it is a final class 
// class Conductor extends Driver {

// }