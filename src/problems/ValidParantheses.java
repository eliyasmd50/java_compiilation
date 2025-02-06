package problems;

import java.util.Arrays;
import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        String[] paranthesesArray = s.split("");
        boolean returnValue = false;
        Stack<Character> parantheses = new Stack<>();

        for (String i : paranthesesArray) {
            if (i.equals("(")) {
                if(Arrays.asList(paranthesesArray).contains(")")){
                    returnValue = true;
                }
            } else if(i.equals("{")) {
                if(Arrays.asList(paranthesesArray).contains("}")){
                    returnValue = true;
                }
            } else if(i.equals("[")) {
                if(Arrays.asList(paranthesesArray).contains("]")){
                    returnValue = true;
                }
            }
        }
        System.out.println(parantheses);

        return returnValue;
    }

    public static void main(String[] args) {
        ValidParantheses validParantheses = new ValidParantheses();
        String parantheses = "([)]";
        System.out.println(validParantheses.isValid(parantheses));
    }

}