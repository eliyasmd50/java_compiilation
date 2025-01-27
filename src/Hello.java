public class Hello {
    private void dataTypes() {
        System.out.println("This is from the variables method");
        String myName = "Eliyas";//string will declare with the double quotes
        System.out.println("My Name is " + myName); // we can use + symbol to concatenate the variable and string the output
        final int myAge = 26;// int by declaring with the 
        System.out.println("My Age is " + myAge);
        float myFloat = 5.66f;  // float variables will need f at the end to declate it as a float
        System.out.println(myFloat);
        char myChar = 'D'; // single character will declare with the single quotes
        System.out.println(myChar);
        int x = 10, y = 20, z = 30;
        System.out.println(x + y + z);
    }
    public void areaOfRectangle() {
        int length = 4;
        int width = 6;
        int area;

        area = length * width;
        System.out.println("Area of Rectangle "+ area);
    }

    private void DataTypes() {
        System.out.println("This is from the Data Types method");
        // Numbers
        byte myByte = 124; // it can save upto 127
        System.out.println(myByte);

        short myShort = 32000; // it can save upto 32700
        System.out.println(myShort);

        float f1 = 35e3f;
        System.out.println(f1);

        double d1 = 123E4d;
        System.out.println(d1);

        //  Boolean
        boolean isJavaFun = true;
        System.out.println(isJavaFun);
    }

    private void TypeCasting() {
        System.out.println("Type Casting method");
        // widening casting
        int myInt = 20;
        System.out.println("Before widening Casting :" + myInt);
        double myDouble = myInt;// here the type of myint changed
        System.out.println("After widening casting " + myDouble);

        // Narrowimg casting
        int myNarrwoedInt = (int) myDouble;
        System.out.println("Narrowing from the double to float " + myNarrwoedInt);
    }

    private void Operators() {
        System.out.println("Operators Method");
        
        // Opeartors method in java like arithmentic, assignment, comparison and Logical
        int x =  20;
        int y = 30;
        System.out.println(x + y);// arithmetic
        System.out.println(x > 30);// comparison operator
        x += 30;
        System.out.println("After Assignment: " + x);
        if(x == 50 && y == 30) {
            System.out.println("Logical Operator is working");
        }
        System.out.println("Operator Method Ends");
    }

    private void strings() {
        System.out.println("Strings method");

        // strings in java
        // strings is an object in java so we can perform methods in string
        String myStr = "Siuuuuuuuuu";
        System.out.println(myStr); // Normal string printing
        System.out.println("The Length of text string is : " + myStr.length()); // to find thr lrngth of a string
        System.out.println(myStr.toLowerCase());// convert the sting to lower case
        System.out.println(myStr.toUpperCase());// convert the string to upper case

        String str1 = "hi i am cristiano ";
        System.out.println(str1.indexOf("stiano"));// this is to find the first occurence of the character

        String str2 = "siuuuuuu";
        System.out.println(str1 + " " + str2);// + symbol is used to concat the variables
        System.out.println(str1.concat(str2));// this also concatination but it is by using concat() method

        // In Java Number are added and strings are concatenated
        int x = 20, y = 30;
        System.out.println( x + y ); // 50 using + sign here to add two numbers
        String z = "40";
        System.out.println(x + z);// 2040 by adding string and number it will give string concatenation

        // using special characters within the string
        String str3 = "This can\'t be a string";
        String str4 = "This is a \"Special\" string";
        String str5 = "This is a \\ backlash string";
        System.out.println(str3); // these three are the kind of strings to use it based on the special characters
        System.out.println(str4);
        System.out.println(str5);
    }

    // main method this class will run first and execute overall all methods
    public static void main(String[] args) {
        System.out.println("HEllow world"); // printing and out statements
        System.out.println(4*8); // numeric printing and calculation withing the out statmenets

        // Variables will declare with the datatypes of JAVA
        // which is also called as Datatypes of JAVA
        Hello hello = new Hello();
        hello.dataTypes();
        hello.areaOfRectangle(); // real life example for the vaiables

        // Datatypes in detalied way like double, short, byte, Long
        hello.DataTypes();

        // Type Casting in JAVA
        hello.TypeCasting();

        // Operators in Java
        hello.Operators();

        // Strings in java
        hello.strings();
    }
}
