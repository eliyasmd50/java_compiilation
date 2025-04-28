package classes.methods;

public class Main {
    // static method can call without object instance
    static void greet() {
        System.out.println("Hi How are you");
    }

    // public method call with object instance
    public void myMethod(){
        System.out.println("this is just a public method");
    }

    // method with parameter passing
    public String callingName(String name){
        return name;
    }

    public static void main(String[] args) {
        greet();// static method calling without intsnacing an object

        Main myObj = new Main();
        myObj.myMethod();// public method calling with object instantiation

        System.out.println("MY name is : " + myObj.callingName("Eliyas"));
    }
}

class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.myMethod();
        System.out.println("MY Real name is "+ myObj.callingName("Leoooooo"));
    }
}
