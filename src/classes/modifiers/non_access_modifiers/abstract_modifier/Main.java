package classes.modifiers.non_access_modifiers.abstract_modifier;

// this is a Abstarct class and it has a abstract method which will extend in the normal class
abstract class SubMain {
    public String name = "Cristianooo";
    public int goals = 950;
    public abstract void carrer(); // abstract method which will expands where the class will extends
}

// abstract class extends here
public class Main extends SubMain {
    // this is the abstract method which is extends here
    public void carrer(){
        System.out.println("This is just the Carrer info");
    }

    // this method is declared in the Main class
    public void greet() {
        System.out.println("This is just the hello world");
    }
}

// This is second class which will include the Main class methods and attributes which originally have the methods from the abstract class
class Student {
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.carrer();
        myObj.greet();
        System.out.println("My name is " + myObj.name + " and my carrer goals is " + myObj.goals);
    }
}