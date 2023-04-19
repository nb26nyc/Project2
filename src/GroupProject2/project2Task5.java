package GroupProject2;

public class project2Task5 {
    public static void main(String[] args) {


        // Write a program to swap 2 numbers without a temporary variable?

        int a = 55;
        int b = 65;
        a=a=b;
        b=a-b;
        a=a-b;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        System.out.println("After swapping: a = " + b + ", b = " + a);
    }
}
