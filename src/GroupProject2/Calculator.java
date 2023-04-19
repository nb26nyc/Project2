package GroupProject2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first number");
        double number1=scan.nextDouble();
        System.out.println("Please enter operator +,-,/,*");
        char operator=scan.next().charAt(0);
        System.out.println("Please enter second number");
        double number2= scan.nextDouble();

        double sum= number1 + number2;
        double subtract= number1 - number2;
        double divide= number1 / number2;
        double multiply= number1 * number2;
        double result= (0);

        if (operator == '+') {
            result = sum;
        } else if (operator == '-') {
            result = subtract;
        } else if (operator == '/') {
            result = divide;
        } else if (operator == '*') {
            result = multiply;
        }else {
            System.out.println("Error, please use correct operator");
        }
        System.out.println("Result=" + result);

    }

    }






