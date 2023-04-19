package GroupProject2;

public class project2Task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program which will calculate the sum
        of even and odd numbers for that array
         */
        int[][] numbers={
                {2,10,8,16},
                {3,5,17,21},
        };
        int sum=0;
        int sum2=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j]%2==0){
                    sum=sum+numbers[i][j];
                } else if (numbers[i][j]%2!=0) {
                    sum2=sum2+numbers[i][j];
                }

            }

        }
        System.out.println("sum of add numbers is"+" "+sum);
        System.out.println("sum of add numbers is"+" "+sum2);
    }


    }
