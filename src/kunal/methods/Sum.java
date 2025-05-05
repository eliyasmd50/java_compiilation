package kunal.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    static void sum() {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1 = inp.nextInt();
        System.out.println("Enter Numver 2: ");
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is : " + sum);
        inp.close();
    }

    // return type mentioning
    static int sum2(){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1 = inp.nextInt();
        System.out.println("Enter Numver 2: ");
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        inp.close();
        return sum;
    }
}
