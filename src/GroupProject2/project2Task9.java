package GroupProject2;

public class project2Task9 {
    public static void main(String[] args) {
        /*
        write a Java program to find the second-largest number in the array

         */
        int []number={40,25,85,10};
        int largestNum=0;
        int secondLargestNum=0;

        for (int i = 0; i <number.length ; i++) {
            if (number[i]>largestNum){
                secondLargestNum=largestNum;
                largestNum=number[i];
            }
            else if (number[i]>secondLargestNum && number[i]!=largestNum) {
                secondLargestNum=number[i];

            }
        }
        System.out.println("second largest number is "+secondLargestNum);
    }
}
