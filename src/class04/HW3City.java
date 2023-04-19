package class04;

import java.util.Scanner;

public class HW3City {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your City");
        String city= scanner.next();
        System.out.println("Please provide temperature in your City in Fahrenheit?");
        int tempF= scanner.nextInt();
        int tempC=(tempF-32)*5/9;
        System.out.println("The temperature in the city"+ city+ "is"+tempC);

    }
}
