package problems;

import java.util.Arrays;

public class RomanToInteger {
    public static int romanToInt(String s) {

        String[] romanArr = s.split("");
        int totalValue = 0;
        int val;

        for(String i : romanArr) {
            System.out.println(i);
        }

        if(s.contains("IV")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("I");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "IV");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }
        if(s.contains("CM")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("C");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "CM");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }
        if(s.contains("XC")){
            int indexOfVal = Arrays.asList(romanArr).indexOf("X");
            Arrays.fill(romanArr, indexOfVal, indexOfVal + 2, "XC");
            // romanArr = Arrays.copyOf(romanArr, romanArr.length - 1);
            System.out.println(Arrays.toString(romanArr));
        }

        for (int i =0; i < romanArr.length; i++) {
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
    public static void main(String[] args){
        int numericValue = romanToInt("MCMXCIV");
        System.out.println(numericValue);
    }
}
