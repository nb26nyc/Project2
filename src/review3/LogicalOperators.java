package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean loginClickable=true;

        if (loginButtonDisplayed && loginClickable) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
    }
}
