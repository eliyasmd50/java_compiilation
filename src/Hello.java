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
        System.out.println("old Line\nthis is a new Line"); // new line
        System.out.println("old Line\tthis is a tab space"); // tab space
        System.out.println("old Line  \bthis is a backspace"); // backspace
        System.out.println("old Line \f this is a backspace"); // Form Feed
    }

    private void MathMethod() {
        System.out.println("This is a math method");
        int x = 20;
        int y = 30;
        System.out.println(Math.max(y, x));// to find what is the highest value in both of this number
        System.out.println(Math.min(x, y));// to find the minimum value of the two numbers
        System.out.println(Math.sqrt(64));// to find the square root of the numbers
        System.out.println(Math.abs(-78.90));// to find the absolute (positive) value of number
        System.out.println(Math.random());// will give a random number between 0.0 to 1.0
        int randomNum = (int)(Math.random() * 11);
        System.out.println(randomNum);// to get the value of 0 to 10
    }

    private void ifElseCondition() {
        System.out.println("in the If Else method");
        int x = 30, y = 30;
        if(x > y) {
            System.out.println("x is greater the Y");
        } else if(x == y){
            System.out.println("X is equal to Y");
        }else {
            System.out.println("Y is greater than x");
        }

        // Ternary operator
        int time = 18;
        String greet = (time > 18) ? "Good Day" : "Good Evening";
        System.out.println(greet);
    }

    private void switchMethos() {
        System.out.println("in the switch method");

        // switch case
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking for the Weekend");
                break;
        }
    }

    private void whileLoopMethod() {
        System.out.println("This is the while loop methods");
        int i = 0;
        // while loop in java
        while (i< 5){
            System.out.print("\t"+ i);
            i++;
        }

        // do while loop in java
        int j = 5;
        do {
            System.out.print("\t" + j);
            j++;
        } while (j < 9);
        System.out.println("");

        // countdown game using while loop
        int x = 5;
        while(x > 0) {
            System.out.print("\t"+x);
            x--;
        }

        // Yatzy game to print Yatzy when th number is 6
        int num = 0;
        while (num <= 6) {
            if(num == 6) {
                System.out.println("Yatzy!!!");
            } else {
                System.out.println("No yatzy");
            }
            num++;
        }
    }

    private void forLoopMethod() {
        System.out.println("In the For Loop Method");
        for (int i=0; i<3; i++) {
            System.out.print("\t" + i);// to print the value between the numbers
        }
        System.out.println("");// for line break
        for (int i =0; i<= 10; i=i+2){
            System.out.print("\t" + i);
        }

        // Nested For Loop
        for(int i = 1; i<= 2; i++) {
            System.out.println("outer loop: " + i);

            for (int j = 1; j<= 3; j++) {
                System.out.println("Inner loop: " + j);
            }
        }

        // for each array is used exclusively to loop through elements in an array
        String[] cars = {"BMV", "Benz", "Audi"};
        for(String i : cars) {
            System.out.print("\t" + i);
        }

        // Example for creating the multiplication table in java
        int number = 2;
        for(int i = 1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    private void breakAndContinue() {
        System.out.println("In the break and continue method");


        // break will break the loop and go out
        for(int i = 0; i<= 10; i++) {
            if( i== 3){
                break;
            }
            System.out.println(i);
        }

        // continue in java will skip the current iteration
        for(int i = 0; i<5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }

    private void ArrayMethod() {
        System.out.println("In the ArrayMethod");
        String[] cars = {"BMV", "Benz", "AUdi"}; // it is a object of strings in an Array
        cars[0] = "Mercedez";
        System.out.println("Length of an array"+cars.length);

        // Loop through an Array using for-each method
        for (String i : cars) {
            System.out.println(i);
        }
        
        // lop through an array using for method
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        // to calculate the average of the given ages
        int[]  ages = { 26, 27, 32, 35, 22, 30, 32};
        float avg, sum = 0;
        int ages_length = ages.length;
        for (int age : ages) {
            sum += age;
        }
        avg = sum / ages_length;
        System.out.println("The Average age of the Ages given is : " + avg);

        // Example to calculate the lowest age of the different ages
        int lowestAge = ages[0];
        for(int age: ages){
            if(lowestAge > age){
                lowestAge = age;
            }
        }
        System.out.println("The Lowest Age among all the ages is :" + lowestAge);


        // Multi Dimensional Array
        int[][] arr = {{1,2,3,4,5}, {3,4,5,6}, {3,3, 4}}; // by assigning and giving value like this will insert the number of rows in to an array of a single data type
        System.out.println(arr[2][2]);
    }

    // Methods in Java
    // By assigning a method to a static it will only depends on the class and can be accessed in the main method within the class
    // it will not have the access for the object instance which is declared
    static void myMethod(String fname, int age) {
        System.out.println("this is a static method");
        System.out.println(fname + " Mohamed is "+ age);
    }

    // check age method to pass the arguments in the methods in java
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You're Eliible for voting");
        } else {
            System.out.println("you're not eligible for voting");
        }
    }

    // to add two numbers which declaring the functions return type as primitive data types
    static int addTwoNum(int x) {
        return 2 + x;
    }

    // Method Overloading in java
    // we can use the same method name again and agin as far as the it is defining with different types 
    static int plusMethod(int x, int y){
        return x + y;
    }

    // we can declare the same with the different types of parameters
    static double plusMethod(double x, double y){
        return x + y;
    }

    // recursion is method used to do when the method needs call itself to process the output'
    static int recursive(int k) {
        if(k > 0) {
            return k + recursive(k - 1);
        } else {
            return 0;
        }
    }

    // using recursion method to add a range of numbers
    static int rangeRecursion(int start, int end) {
        if(end > start) {
            return end + rangeRecursion(start, end - 1);
        } else {
            return end;
        }
    }

    // main method this class will run first and execute overall all methods
    public static void main(String[] args) {
        System.out.println("HEllow world"); // printing and out statements
        System.out.println(4*8); // numeric printing and calculation withing the out statmenets

        // Variables will declare with the datatypes of JAVA
        // which is also called as Datatypes of JAVA
        Hello hello = new Hello(); // object instance for the class file, this is the same method for whereve we are declaring it
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

        // Math Method in java
        hello.MathMethod();

        // if condition statemnets
        hello.ifElseCondition();

        // switch statements
        hello.switchMethos();

        // while statements
        hello.whileLoopMethod();

        // for Loop statements
        hello.forLoopMethod();

        // Break and continue method
        hello.breakAndContinue();


        // Arrays in JAVA
        hello.ArrayMethod();

        // calling method without creating an instance of an object
        myMethod("", 0);
        myMethod("",0);// it can be called multiple times in the main method
        // arguments is passed in the below method calling
        myMethod("Eliyas", 0); // this is a method which is used to declare with the parameters
        myMethod("Eli", 26);// passing multiple arguments

        // calling the check age method
        checkAge(26);

        // calling the method with return type of int to return an int type vaue
        // default value of int is 0
        // default value of string is null
        // there is no undefined in the java
        System.out.println(addTwoNum(5));

        // calling the method overloading methods to identify the difference
        int myNum1 = plusMethod(2, 3);
        double myNum2 = plusMethod(1.2, 2.8);
        System.out.println("int: " + myNum1);
        System.out.println("Double: " + myNum2);


        // calling the recursive method
        int recursiveResult = recursive(5);
        System.out.println(recursiveResult);

        // calling recursion with a given range
        int rangeRecursion = rangeRecursion(5, 10);
        System.out.println(rangeRecursion);
    }
}
