package problems;

import java.util.Arrays;

public class RomanToInteger {
    public static int romanToInt(String s) {

        String[] romanArr = s.split("");
        int totalValue = 0;
        int val;
        String[] newRomanArr = {};

        // for testing purpose is this block of code
        for(String i : romanArr) {
            System.out.println(i);
        }

        if(s.contains("IV")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("I");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "IV");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }
        if(s.contains("IX")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("I");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "IX");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }
        if(s.contains("CD")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("C");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "CD");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }
        if(s.contains("CM")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("C");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "CM");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }
        if(s.contains("XL")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("X");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "XL");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }
        if(s.contains("XC")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("X");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "XC");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }

        // calling the dup
        newRomanArr = duplicateRemoval(romanArr);
        System.out.println(Arrays.toString(newRomanArr));

        for (int i =0; i < newRomanArr.length; i++) {
            switch(romanArr[i]) {
                case "I":
                    val = 1;
                    break;
                case "V":
                    val = 5;
                    break;
                case "X":
                    val = 10;
                    break;
                case "L":
                    val = 50;
                    break;
                case "C":
                    val = 100;
                    break;
                case "D":
                    val = 500;
                    break;
                case "M":
                    val = 1000;
                    break;
                case "IV":
                    val = 4;
                    break;
                case "IX":
                    val = 9;
                    break;
                case "XL":
                    val = 40;
                    break;
                case "XC":
                    val = 90;
                    break;
                case "CD":
                    val = 400;
                    break;
                case "CM":
                    val = 900;
                    break;
                default: 
                    val = 0;
                    break;
            }
            totalValue += val;
        }

        return totalValue;
    }

    static String[] duplicateRemoval(String[] romanArr) {
        String[] newRomanArr = {}; // to initsialize the Array with the empty value and not null
        for (String i : romanArr) {
            if (i.length() == 1){
                newRomanArr = new String[]{i}; // array cannot be declared after initialization, creating an instance of that array is the only way to declare again
            } else if(Arrays.asList(newRomanArr).contains(i) == false && i.length() == 2) {
                newRomanArr = new String[]{i};
            }
        }
        System.out.println(Arrays.toString(newRomanArr));
        return newRomanArr;
    }
    public static void main(String[] args){
        int numericValue = romanToInt("MCMXCIV");
        System.out.println(numericValue);
    }
}
