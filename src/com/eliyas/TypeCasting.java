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
        int a = 278;
        byte b = (byte)(a); // 278 % 256
        System.out.println(b);
    }
}
