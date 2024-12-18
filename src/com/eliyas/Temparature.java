package com.eliyas;

import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        System.out.println("Please Enter th value in celcius: ");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        System.out.println("Farenheit of "+tempC + " is:");
        float tempF = ( tempC * 9/5) + 32;
        System.out.println(tempF);

}
}