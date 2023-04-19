package GroupProject2;

public class project2Task1 {
    public static void main(String[] args) {
        /* Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.

        */
        int[] temperatures = {70, 72, 66, 90, 81, 75, 60};
        int highestTemperature = Integer.MIN_VALUE;
        int lowestTemperature = Integer.MAX_VALUE;

        for (int i=0; i< temperatures.length; i++){
           if (temperatures[i]< lowestTemperature){
               lowestTemperature=temperatures[i];
           }
            System.out.println("Highest temperature for the week:" + highestTemperature);
            System.out.println("Lowest temperature for the week:" + lowestTemperature);

        }
    }
}
