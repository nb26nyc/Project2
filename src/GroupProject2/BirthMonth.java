package GroupProject2;

import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the month you were born");
        String month= scan.nextLine();

        switch(month){
            case "March":
            case "April":
            case "May":
                System.out.println("The season you were born in is Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("The season you were born in is Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("The season you were born in is Fall");
                break;
            case "December":
            case "January":
                System.out.println("The season you were born in is Winter");
                break;

        }
    }
}
