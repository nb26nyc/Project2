package GroupProject2;

public class project2Task2 {
    public static void main(String[] args) {
                /*
         Create an array of integer values. After the array is created,
         calculate the sum of all stored elements in that array
         */

        int[] phonesSold = {10,15,20,25,30};
        int sum = 0;
        for (int i = 0; i < phonesSold.length; i++) {
            sum = sum + phonesSold[i];

        }
        System.out.println(sum);
    }
}



