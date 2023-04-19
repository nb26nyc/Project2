package GroupProject2;

public class Grade {
    public static void main(String[] args) {

        int quiz=60;
        int midTerm=85;
        int finalScores=90;
        int average=(quiz+midTerm+finalScores)/3;

        if (average>=90) {
            System.out.println("Grade is A");
        } else if (average>=70 && average<90) {
            System.out.println("Grade is B");
        } else if (average>=50 && average<70) {
            System.out.println("Grade is C");
        } else if (average<50) {
            System.out.println("Grade F");

        }

    }

    }

