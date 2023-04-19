package class04;

import java.util.Scanner;

public class HW3DMVCheck {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is you age?");

        int age= scan.nextInt();
        if (age>18) {
            System.out.println("You can get you Driver Licence");
        }else {
            System.out.println("You can get your permit first");
        }

    }
}
