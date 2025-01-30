package oops;

public class Main {
    int x = 5; // attributes or fileds of a class
    int y;

    // final keyword is useful when the value of the variable is not changed
    final int z = 30; // to keep the value unchanged

    // we can declare as many attributes as we want
    String fname = "Jhon";
    String lname = "Doe";
    int age = 26;

    // static Method in a class will perform some opertations
    static void myMethod(){
        System.out.println("static method called without object instance");
    }

    // public methods in a class needs an object to call it
    public void publicMethod() {
        System.out.println("Public method called with the object instance");
    }
    

    // Main method
    public static void main(String[] args ){
        Main myObj1 = new Main(); // to create an object of the class
        Main myObj2 = new Main(); // we can create multiple instance of a same class
        System.out.println(myObj1.x);

        myObj2.y = 20; // altering the attributes of the Main class
        System.out.println(myObj2.y);

        myObj1.x = 10; // overriding the existing object attributes
        System.out.println(myObj1.x);

        // myObj1.z = 20; // it will throws error because it is a final field
        System.out.println(myObj1.z);// declaring the variable with final keyword which makes the variable as constants

        // by changing the variables of the different objects it will not affect one another
        // here we are using myobj1 and myobj2 
        myObj1.x = 25; // this won't change the object 2 because it is a different instance
        System.out.println(myObj1.x); // 25
        System.out.println(myObj2.x); // 5


        // using all the attributes initialized in the class
        System.out.println("Full Name is : " + myObj1.fname + " " + myObj1.lname + " " + "Age is : " + myObj1.age);

        // calling the method name to execute the logics which is written in the block of code
        // static method calling
        myMethod(); // why particularly here is this is the main method and here the code will be executed

        // public method calling
        myObj1.publicMethod();
    }
}
