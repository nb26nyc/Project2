package GroupProject2;

public class HW9Array5 {
    public static void main(String[] args) {

        //Create an array of animals and store 5 elements into it. Using 2 different
        // loops print all elements from the array.

        String [] var={"Cat","Mouse","Koala","Horse","Dog"};
        for (int i=0; i< var.length; i++){
            System.out.println(var[i]+" ");
        }
        System.out.println();
        for (String s : var){
            System.out.println(s+" ");
        }
    }
}
