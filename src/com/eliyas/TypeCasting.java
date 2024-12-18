package com.eliyas;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String name =  input.next();
        //System.out.println(name);
        //float avg = input.nextFloat();
        //int avg = input.nextInt();
        //System.out.println(avg);

        // Type casting
        //int num = (int)(56.67f);
        //System.out.println(num);

        // Automatic type promotion in expressions
        // int a = 278;
        // byte b = (byte)(a); // 278 % 256

        // conversion into int when doing the byte caculation
        // byte a = 50;
        // byte b = 40;
        // byte c = 100;
        // int d = a * b / c;// doing the type casting here
        // System.out.println(d);

        // in java characters using the unicode values and charecters has Ascii value
        // int number = 'A';
        // System.out.println(number);

        // since java has an unicode values the other language characters will have the exact unicode values in java
        // System.out.println("வணக்கம்");

        // type casting will promote everything when doing operations with it
        //System.out.println(3 * 6);// integer
        // System.out.println( 3 * 6.567879834545435);// double datatype
        // System.out.println( 3 * 6.8976687f);// float conversion

        // Example for the type conversion for the bigger type it will convert it into the bigger version
        byte b= 42;
        int i = 50000;
        char c = 'a';
        short s = 1024;
        float f = 5.67f;
        double d = 0.1234;
        double result = ( f * b) + ( i / c ) - ( d * s );
        // float + int - double = double (converted into double because it is the higher type
        System.out.println(( f * b) + " " + ( i / c ) + " " + ( d - s ));
        System.out.println(result);
    }
}
