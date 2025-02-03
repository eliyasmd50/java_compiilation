package oops.interfaces;

// creating multiple interface
interface FirstInterface {
    public void message1();
}

interface SecondInterface {
    public void message2();
}

// creating a class that implements the multiple interface
class MessagingApp implements FirstInterface, SecondInterface {
    public void message1() {
        System.out.println("Some random texts");
    }
    public void message2() {
        System.out.println("More Random text");
    }
}

// Finally in the main class creating an object and calling the methods which is implemented in the class
public class MultipleInterface {
    public static void main(String[] args) {
        // creating objects for the multiple interface
        MessagingApp app = new MessagingApp();
        app.message1();
        app.message2();
    }
}
