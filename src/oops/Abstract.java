package oops;

 abstract class Abstract {
    public String name = "Jhon";
    public int age = 26;
    public abstract void study();// abstract method used
}

// subclass to inherit Abstract
class Student extends Abstract {
    public int graduatedYear = 2019;
    public void study() { // this method is inherited from the abstract class and the body is present here
        System.out.println(" studying all day long");
    }
}