package classes.constructor;

public class Main {
    int x;

    // class constructor in Java by with this class name
    public Main(){
        x = 3;// when instancing the object it will intilaize the value
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}

// class with constructor as parameter passing init
class Second {
    int personAge;
    String personName;

    public Second(int age, String name){
        personName = name;
        personAge = age;
    }

    //calling the class with passing the arguments
    public static void main(String[] args) {
        Second myObj = new Second(45,"Cristiano Ronaldo");
        System.out.println("Hi my age is " + myObj.personAge + " and My name is " + myObj.personName + " Siuuuu");
    }
}