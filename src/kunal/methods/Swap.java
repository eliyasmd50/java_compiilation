package kunal.methods;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // swap two numbers 
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
