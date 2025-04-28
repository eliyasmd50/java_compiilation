package classes._package; // this is the user defined package
import java.util.Scanner; // this is the default packages which is in Java
import classes.methods.Main; // this is the custom package Class which is imported from other package

public class MyPackage {
    public static void main(String[] args) {
        System.out.println("Give me your name");
        Scanner inpObj = new Scanner(System.in);
        String userName = inpObj.nextLine();
        System.out.println("Hi my name is " + userName);
        inpObj.close();

        Main myObj = new Main();
        myObj.myMethod();
    }
}
