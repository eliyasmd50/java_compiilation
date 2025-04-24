package classes.objects;

// class and object defining in java
public class Main {
    int x = 20;

    public static void main(String[] args){
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println("Compiling in Main.java");
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}

