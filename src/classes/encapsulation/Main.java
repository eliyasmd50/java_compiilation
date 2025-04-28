package classes.encapsulation;

// this is the class whcih has private method which will not be accessed outside the class
public class Main {
    private String name = "ELiyas";

    // getter method
    public String getName() {
        return name;
    }

    //setter method
    public void setName(String newName) {
        this.name = newName;
    }
}

// this is the encapsulation class which will not exposed some atributes which declared in the 
class Person {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("Hi my name is " + myObj.getName());
        myObj.setName("Cristiano");
        System.out.println("Hi my name is " + myObj.getName());
    }
}


