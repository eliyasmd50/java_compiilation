package oops;
import java.util.Scanner; // importing just the Scanner class
//import java.util.*; // this is to import all the classes from this particular package/folder

public class Main {
    int x = 5; // attributes or fileds of a class
    int y;

    // final keyword is useful when the value of the variable is not changed
    final int z = 30; // to keep the value unchanged

    // we can declare as many attributes as we want
    String fname = "Jhon";
    String lname = "Doe";
    int age = 26;

    // final declaring value
    final double pi = 3.14;

    // static Method in a class will perform some opertations
    static void myMethod(){
        System.out.println("static method called without object instance");
    }

    // public methods in a class needs an object to call it
    public void publicMethod() {
        System.out.println("Public method called with the object instance");
    }

    // creating a class constructor for the Main class to initialize the variable
    public Main(int x) {
        y = 5;// this is called when the object of the class is defined
        y = x;
    }

    // static method for greet
    static void greet() {
        System.out.println("Hi i am just a static method and i cannot be accessed outside the class");
    }
    

    // Main method
    public static void main(String[] args ){
        Main myObj1 = new Main(7); // to create an object of the class
        Main myObj2 = new Main(7); // we can create multiple instance of a same class
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

        // Constructor Name should be same as the class name
        // Constructor does not have any return type
        // class creates a constructor by default
        // Constructor in java is used to define the variable of the attributes when the class object is created
        Main construct = new Main(7);
        // to Note y is just defined but never initialized so we are just using it to initialize via constructor
        System.out.println("Constructor given Value of the y :"+construct.y);// here we are calling the value when the constructore defined by its own 


        // constructor paramters we can give constructor a parameter at the time of creating an object instance
        Main constructParam = new Main(27);
        System.out.println("Constructor parameter is given for the Value of the y :"+constructParam.y);

        // Access Modifiers in java
        // Public it is available for all the classes
        // Provate it is accessed only with the class
        // Protected it can be accessed its own package classes and inherited classes

        // Non Access Modifiers
        // final declared class,  it cannot be inherited
        // abstract decalred class, it cannot be used to create an object

        // for atributes and methods
        // transient is used when attributes and methods needs to be skipped when serializing the object
        // synchronized is used for methods needs to be called by one thread at a time
        // volatile - The value of an attribute is not cached thread-locally and it is always taken from the main memory

        // final is used to declare the value of the attribute to a constants and cannot be reused
        //myObj1.pi = 20.9;// it will throw error because it is a final attribute and it cannt be reassigned
        System.out.println(myObj1.pi);// 3.14
    
        // static Method is only belongs to that particular class and cannot be accessed outside the class
        greet();// we can call this method without creating an object instance within the main method of the class

        // abstract method 
        // the subclass will only have the body of the method in the abstract class which it is extending
        // we cannot create a object for the abstract class only by its extended class
        Student student = new Student();
        System.out.println("student name is : " + student.name);
        System.out.println("student age is : " + student.age);// Name and age is defined in the abstract class
        System.out.println("student graduation year is : " + student.graduatedYear);
        student.study(); // this method is declared in the abstract class but the body is defined in the sub class and it is called in the Main class which is here by object to execute it
        

        // ENcapsulation in java
        // it is used for define attribute privately and not keep as a public classes to access it
        Encapsul encpasul = new Encapsul();
        encpasul.setName("Jhon");
        System.out.println(encpasul.getName());

        // using Scanner class to define and use the input of the variable
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the UserName : ");

        String userName = input.nextLine();
        System.out.println("Your Name is : " + userName);
        input.close(); // closing the Resources of input whchi is still open
    }
}
