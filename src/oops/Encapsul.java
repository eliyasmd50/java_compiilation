package oops;

public class Encapsul {
    private String person; // person value is private and it cannot be accessed outside of the classes
    
    public String getName() {
        return person; // this method is the only way for the classess to access the vlaue outside the class
    }

    public void setName(String newPerson) {
        this.person = newPerson;// this method is used to manipulate the value of the person outside the class
    }
}
