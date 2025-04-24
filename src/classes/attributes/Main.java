package classes.attributes;

public class Main {
    // below given variables are declared as attributes in the class
    int x;
    int y = 20;
    final int z = 50;

    public static void main(String[] args){
        Main myObj1 = new Main();
        myObj1.x = 40;
        System.out.println(myObj1.x);
        System.out.println(myObj1.y);
        // attribute Overriding
        myObj1.y = 30;
        System.out.println(myObj1.y);
        System.out.println(myObj1.z);
    }
}
