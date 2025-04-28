package classes.modifiers.non_access_modifiers.static_modifier;

public class Main {
    String name;

    // constructor value assigning
    Main (String x) {
        name = x;
    }
    static int y = 25; // static attributes

    public void greet() {
        System.out.println(name);
    }

    static void greetings() {
        System.out.println("uno dos thress");
    }

    public static void main(String[] args) {
        greetings(); // calling the method within 
        System.out.println(y);// class attribute accessed without creating the object instance
        Main myObj = new Main("Hala Madrid"); // object created with the constructor
        myObj.greet();
    }

}