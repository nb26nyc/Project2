package GroupProject2;

public class project2Task10 {
    public static void main(String[] args) {
      /*
      write a program to print out duplicate elements from an array of strings

       */
        String[] num={"NYC","Milan","Paris","NYC", "Spain"};
        for (String s : num) {
            if(s==num[0]){
                System.out.println(s);

            }

        }

    }
}
