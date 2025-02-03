package oops.innerClass;

class OuterClass {
    int x = 10;

    // Inner class 
    class InnerClass {
        int y = 20;
    }

    // if the class should not want to access outside 
    // private class SecondInnerClass {
    //     int z = 30;
    // }

    // static inner class
    static class StaticInnerClass {
        int m = 40;
    }
}

public class Main {
    public static void main(String[] args) {

        // in java the outer class is instantiated 
        // And the inner class object will be instantiated based on the outer class 
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(" The value of y is " + myInner.y);// getting the attributes of the inner class
        System.out.println("The value of the Outer class : " + myOuter.x);// getting the value of the outer class
        System.out.println(" Sum of inner and outer class values is: " + (myInner.y + myOuter.x));

         // the below code will give an error
        // because the second inner class is declared as a private so it canno be accessed outside the class
        //OuterClass.SecondInnerClass mySecondInnerClass = myOuter.new SecondInnerClass();

        // In here we are calling the static class which we can call directly as a inner class without using the outer class objects
        OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();

        System.out.println(staticClass.m);  // here the out will be 40


    }
}