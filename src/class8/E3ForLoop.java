package class8;

public class E3ForLoop {
    public static void main(String[] args) {

        //write a loop to add all the even numbers from 1 to 30 for example from 1 to 7 {2 4 6} =12
        // 1 2 3 4 5 6 7 8 9 10=>

        int sum=0;
        for (int i=1; i <=30; i++){
            if (i%2==0){
                sum=sum+i;

            }
            System.out.println(sum);
        }
    }
}
