package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        // to print all whole numbers from 15 to 30

        int number= 15;
        while (number <=30){
            System.out.println(number +" ");
            number++;

            //to print all the numbers from starting point to an ending point
            // ask the user for starting and ending number

            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the starting and the ending point");
            int start= scanner.nextInt();
            int end= scanner.nextInt();
            int step= scanner.nextInt();
            int counter= start;
            while (counter<=end){
                System.out.println(counter+" ");
                counter++; // counter==gap;yes

                // start:5
                // end:50
                // step:5



            }

        }

    }
}
