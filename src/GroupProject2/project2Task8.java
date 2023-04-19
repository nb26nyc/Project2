package GroupProject2;

public class project2Task8 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array
         */
        int []number={15,30,50,95};
        int max=number[0];
        int min=number[0];

        for (int i = 1; i <number.length ; i++) {
            if (number[i]>max){
                max=number[i];
            }
            if (number[i]<min){
                min=number[i];
            }
        }
        System.out.println("Maximum number"+" "+ max);
        System.out.println("Maximum number"+" "+ min);
    }
}
