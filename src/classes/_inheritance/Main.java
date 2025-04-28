package classes._inheritance;

// Superclass whih is a parent class to inherit
class Main {
    protected String name = "Cristiano";
    public void greet() {
        System.out.println("This is just the greet Method");
    }
}

// Subclass(Child) which inherits the super class and uses the method
class RealMadrid extends Main {
    public void noOfUCL() {
        System.out.println("Realmadrid has a total of 15 UCL's");
    }
    public static void main(String[] args) {
        RealMadrid myObj = new RealMadrid();
        myObj.greet();
        System.out.println("Hi my name is " + myObj.name);
        myObj.name = "Eliyas";
        System.out.println("Hi my name is " + myObj.name);
        myObj.noOfUCL();
    }
}
