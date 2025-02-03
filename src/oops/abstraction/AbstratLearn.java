package oops.abstraction;


// Data Abstraction is the process of hiding certain details and showing only the essential details to the users
// Abstract class is a restricted class it cannot be able to create an object
// in the Abstract class we can extend and use its methods and atributes

// abstract class
 abstract class AbstratLearn {
    // Abstract method it is only be defined in the Abstract class
    // the body of the Abstract method will be defined in the subclass which it is inherited
    // abstarct class can have both regular method and abstract method

    // abstract method does'nt have a body but defined here
    public abstract void animalSound();
    
    //regular method
    public void sleep() {
        System.out.println("The ANimal is Sleeping ZzZzZz!");
    }
}

// sub class which is used for defining the abstract method
class Sloth extends AbstratLearn {
    // abstract method defined here
    public void animalSound() {
        System.out.println(" The sloth is squeaking");
    }
}

// Main class for call the extended class
class Animals {
    public static void main(String[] args) {
        Sloth sloth = new Sloth();
        sloth.animalSound(); // method that initiated in the abstract class and defined in the extended class
        sloth.sleep();// method that is initited in the abstract class
    }
}

// why and when to use abstraction
// to achieve security - when need to hide some details and show only the certain details to th users