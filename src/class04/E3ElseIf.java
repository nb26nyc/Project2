package class04;

import java.util.SortedMap;

public class E3ElseIf {
    public static void main(String[] args) {

        int number = 10;
        if (number > 10) {
            System.out.println("lets party");
        } else {
            System.out.println("lets study");

            int day = 1;
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            }else if(day ==4 ) {
                System.out.println("Thursday");
            }else if(day == 5) {
                System.out.println("Friday");
            }else if(day == 6) {
                System.out.println("Saturday");
            }else if(day == 7) {
                System.out.println("Sunday");
            }else{
                System.out.println("wrong day number");




            }
        }

    }
}
