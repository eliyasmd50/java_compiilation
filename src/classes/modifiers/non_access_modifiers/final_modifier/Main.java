package classes.modifiers.non_access_modifiers.final_modifier;

public class Main {
    // by declaring attributes to final it wont be manipulated once after decalred
    int x = 10;
    final double PI = 3.14;
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj.PI);
        myObj.x = 20; // here i am changing the value which is not declared as final 
        //myObj.PI = 3.24;// in this place i am getting an error while changing the value once atfer declared
        System.out.println(myObj.x);
        System.out.println(myObj.PI);// still the same value i can't change the value once it is declared as final
    }
}
