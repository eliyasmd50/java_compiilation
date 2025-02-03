package oops.innerClass;

public class Access {
    int x = 20;

    class InnerrClass {
        public int executeMethod() {
            return x;
        }
    }
}

class AgainMain {
    public static void main(String[] args) {
        Access myOuter = new Access();

        // The Advantage of inner class instance here is it can access the outer class Attributes
        Access.InnerrClass myInner = myOuter.new InnerrClass();  
        System.out.println(myInner.executeMethod());
    }
}


