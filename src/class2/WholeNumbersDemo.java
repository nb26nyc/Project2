package class2;

public class WholeNumbersDemo {
    public static void main(String[] args) {
        /*
        byte => is data type
        age => variable
        = => means store the number in the variable
        50 => is the umber that we want to store
        ; => part of the syntax just like in English we end sentence with . we end a line in java with ;
         */
        byte age=100;
        System.out.println(age);
        short noOfApples=300;
        System.out.println(noOfApples);
        // int is the most widely used data type to store whole numbers
        int bankBalance=1000000;
        System.out.println(bankBalance);
        /*
        all the whole numbers by default are treated as int whenever we have to store a number which is beyond the range of int we have to explicitly write the letter 'L' at the end to tell java we are dealing with a special very large number
         */
        long veryBigNumber= 45_454_545_445_454L;
        System.out.println(veryBigNumber);

    }
}
