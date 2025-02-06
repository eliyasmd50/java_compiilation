package oops.enums;

// declaring enum outside the class
enum Signal {
    RED,
    YELLOW,
    GREEN
}


// enum is a specially listed characters
// it is a special class which has group of constants which is like declaring as final
public class Main {
    public static void main(String[] args) {
        Signal trafficSignal = Signal.GREEN;
        System.out.println(trafficSignal);
    }
}


// in this class we are declaring the enum inside a class
class TrafficSIgnal {
    enum NotSignalLights {
        RED,
        BLUE,
        GREEN
    }
    public static void main(String[] args) {
        NotSignalLights trafficSignal = NotSignalLights.BLUE;
        System.out.println(trafficSignal);
    }
}

// enum in a switch statement
class EnumInASwutchStatement {
    public static void main(String[] args) {
        Signal mySignal = Signal.RED;
        System.out.println(mySignal);

        switch (mySignal) {
            case RED:
                System.out.println("STOP");
                break;
            case YELLOW:
                System.out.println("LISTEN");
                break;
            case GREEN:
                System.out.println("GO");
                break;
        
            default:
                break;
        }
    }
}

// Loop through an enum
class enumLoop {
    public static void main(String[] args) {
        for(Signal sig : Signal.values()){
            System.out.println(sig);
        }
    }
}

// enum can just like be class but it cannot be used to create objects 
// enum can have attributes and menthods
// value of the enums is final and cannot be changed

// why and when to use is like 
// the value that should not be changed that is what declared in enums