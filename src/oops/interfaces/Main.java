package oops.interfaces;


// Abstraction is Achieved using inteface here
// defining methods with empty like Abstraction
interface Animals {
    public void animalSound();// defining the empty body methods
    public void run();
}

// class to implement as like the inheritance extends
class Horse implements Animals {
    public void animalSound() {
        System.out.println("The sound of the Horse is a neigh");
    }
    public void run() {
        System.out.println("The hourse runs in a 30 miles per hour");
    }
}

// implementing the second class with the dog example
class Dog implements Animals {
    public void animalSound() {
        System.out.println("The sound of the Dog is a Barking");
    }
    public void run() {
        System.out.println("The Dogs usually runs and stops always");
    }
}

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Dog dog = new Dog();

        // calling all the methods which is initially defined in interface and implemented in the different classes
        horse.animalSound();
        dog.animalSound();
        horse.run();
        dog.run();
    }
}

// We cannot create an object using the interface
// Interface methods is defualt abstract and public
// Interface attributes are public static and final
// classes implementing Interface needs to define all of its methods

// why and when to use interface
// To achive security as metioned in Abstraction
// Inheritance dosen't provide multiple inheritance it will allow only one parent class to extent it
// for that reason we can use Interface to implement multipe Interface 