public class TypeCasting {
    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();
        Tasks tasks = new Tasks();
        AverageCalculation averageCalculation = new AverageCalculation();
        typeCasting.greet();
        tasks.doTheTasks();

        // widening casting giving higher type for the lower type value so it will automaticaly casting to the higher casting
        int val1 = 10;
        double doubleVal = val1;
        System.out.println(val1);
        System.out.println(doubleVal);

        //Manual Casting doing the Narrowing casting manually
        double doubleVal1 = 10.797979d;
        int singleVal = (int) doubleVal1;// by using oaranthesis we can convert it into a single value
        System.out.println(doubleVal1);
        System.out.println(singleVal);// converted as int type 

        // real Example of Type casting
        int userMark = 442;
        averageCalculation.average(userMark);
    }
    private void greet() {
        System.out.println("Welcome Good Morning");
    }
  }
    class Tasks {
        public void doTheTasks() {
            System.out.println("Do all the tasks Assigned today");
        }
    }

    class AverageCalculation {
        public void average(int userMark) {
            int overallMarks = 500;
            float average = (float) userMark / overallMarks * 100.0f;
            System.out.println("The avreage Marks of the students is " + average);
        }
    }