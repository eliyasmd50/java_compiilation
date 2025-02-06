package oops.scanners;

import java.util.Scanner;

// String user input
public class Main {
    public static void main(String[] args) {
        Scanner inObj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = inObj.nextLine();
        System.out.println("Enter Your age: ");
        int age = inObj.nextInt();
        System.out.println("Are You married just enter TRUE or FALSE: ");
        boolean married = inObj.nextBoolean();
        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Married: " + married);
        inObj.close();
    }
}
