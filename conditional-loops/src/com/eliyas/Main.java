package com.eliyas;

public class Main {
    public static void main(String[] args) {

        /*
            syntax for the if statement
            if ( boolean T or F) {
                body
            }
         */
        int salary = 46140;
        if (salary > 50000) {
            salary = salary + 1000;
        } else {
            salary = salary + 2000;
        }
        System.out.println(salary);
    }
}