public class AlgebricFormula {
    public static void main(String[] args) {
        int length = 4;
        int width = 6;
        int area;
        // Area of a Rectangle
        System.out.println("Area is :" + length * width);
        // perimeter of a rectangle
        System.out.println("Perimeter is : "+ 2*(4 + 6));
        int side = 4;
        System.out.println("Area square is : " + side * side);
        //Area of a circle
        float pi = 3.1416f;
        int radius = 10;
        System.out.println("Area of a circle : "+ pi * (radius*radius));
        //Area of a Triangle
        int base = 24;
        int height = 48;
        System.out.println("Area of a TRiangle is : "+ (base * height)/ 2);
    }
}