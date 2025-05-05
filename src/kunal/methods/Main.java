package kunal.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // to get the two number and sum the two numbers 
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1 = inp.nextInt();
        System.out.println("Enter Numver 2: ");
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is : " + sum);
        inp.close();
    }
}
