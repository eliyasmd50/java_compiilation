package oops.polymorphism;

public class Animal {
    public void animalSound() {
        System.out.println(" The Animal makes the Sound ");
    }
}

class Eagle extends Animal {
    public void animalSound() {
        System.out.println(" The Eagle will do a : Screech");
    }
}

class Hippopotamus extends Animal {
    public void animalSound() {
        System.out.println(" The Hippopotamus will do : Wheeze-Honk ");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // creating an Animal object
        Eagle eagle = new Eagle();// creating the eagle objects
        Hippopotamus hippo = new Hippopotamus();// creating the hippo objects to call the animal sounds variation


        // below are all the same methods from the parent class but by exteding it we are created a different method to perform
        myAnimal.animalSound();
        eagle.animalSound();
        hippo.animalSound();

        /// when to use the inheritance and polymorphism- 
        /// when in need of code reusablility of the parent class when there is same attributes and methods are used
    }
}