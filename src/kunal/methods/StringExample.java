package kunal.methods;

public class StringExample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);

        String message = myGreet("Eliyas");
        System.out.println(message);
    }

    static String myGreet(String name) {
        String greeting = "Hello " + name;
        return greeting;
    }

    static String greet() {
        String greeting = "Hello i am cristiano Siuuuuuu";
        return greeting;
    }
}
