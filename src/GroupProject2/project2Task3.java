package GroupProject2;

public class project2Task3 {
    public static void main(String[] args) {

       /*
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */
        int[][] numbers= {{5, 6, 7, 8, 9, 10},
                {15,16,17,18,19,20}};
        for (int[] nums: numbers){
            for (int num2 : nums){
                if (num2 % 2==0){
                    System.out.println(num2);

                }
            }
        }

        }
    }

