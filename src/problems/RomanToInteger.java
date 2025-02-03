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

        // printing the values before doing the duplicate removal
        System.out.println("Before Removal");
        System.out.println(Arrays.toString(romanArr));
        // calling the dup
        newRomanArr = duplicateRemoval(romanArr);
        System.out.println("After Removal");
        System.out.println(Arrays.toString(newRomanArr));

        for (int i =0; i < newRomanArr.length; i++) {
            switch(newRomanArr[i]) {
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
        String[] newRomanArray = new String[romanArr.length];// Initializing the new Array with default value 
        int index = 0;
        for (String i : romanArr) {
            if(i.length() != 1){
                if(!Arrays.asList(newRomanArray).contains(i)){
                    newRomanArray[index] = i;
                    index++;
                }
            } else {
                newRomanArray[index] = i;
                index++;
            }
        }

        System.out.println("index" + index);
        // this will have the new size of the Array
        newRomanArray = Arrays.copyOf(newRomanArray, index); // Resizing the Array after removing the duplicates
        System.out.println(Arrays.toString(newRomanArray));
        return newRomanArray;
    }

    public static void main(String[] args){
        int numericValue = romanToInt("III");
        System.out.println(numericValue);
    }
}
