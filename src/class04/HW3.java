package class04;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the amount of loan is needed?");
        int amount= scanner.nextInt();
        if (amount<=200000) {
            System.out.println("I would lend you the money");
        }else {
            System.out.println("I would not lend you the money");
        }
    }
}
