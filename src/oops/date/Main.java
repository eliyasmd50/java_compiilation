package oops.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


// to get the current date from the LocalDate class
public class Main {
    public static void main(String[] args) {
        LocalDate currDate = LocalDate.now(); // give the date format like yyyy-mm-dd
        System.out.println(currDate);
    }
}

// to get the currenttime in the format of HH-MM-SS-NS
class CurrentTime {
    public static void main(String[] args) {
        LocalTime myCrrentTime = LocalTime.now();
        System.out.println(myCrrentTime);
    }
}

// to get the current data and time with the format of YYYY-MM-DD-HH-MM-SS-NS
class CurrentDateAndTime {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);
    }
}


// formatting the date based on our requirements
class DateAndTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before Formatting: " + myDateTime);

        // creating the formatter object here
        DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("E,MMM-dd-yyyy HH-mm-ss");
        // applying the format to the data time object
        String formattedDate = myDateTime.format(myFormatterObj);
        System.out.println("After formatting : "+ formattedDate);
    }
}