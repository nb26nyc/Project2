package class04;

import java.util.Scanner;
import java.util.SortedMap;

public class E5Scanner {
    public static void main(String[] args) {

        /*
        Scanner part of the Syntax
        Scanner => is a variable of type scanner just like we create a variable of type a String
        new => is a special keyboard which create the object of a class
        Scanner again with ()
        Scanner.in => means we want to use the scanner class for talking the user input
        */
        //whenever we need to ake the input from the user we need this code

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter your name");
        // Calling the next method to take a String from the user
        String name=scan.next();
        System.out.println("You are amazing"+name);

    }
}
