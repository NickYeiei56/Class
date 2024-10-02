import java.util.Scanner;

public class Case2 {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your score: ");
        int score = scan.nextInt();
        char grade1 = (0);
        char note = (0);

        if ( score <= 100 && score >= 80 ) {
            grade1 = 'A';
        }

        else if ( score <=79  && score >= 70 ) {
            grade1 = 'B';
            if (score <= 79 && score >= 75) {
                note = '+';
            }
        }

        else if ( score <= 69 && score >= 60 ) {
            grade1 = 'C';
            if (score <= 69 && score >= 65) {
                note = '+';
            }
        }        

        else if ( score <= 59 && score >= 50 ) {
            grade1 = 'D';
            if (score <= 59 && score >= 55) {
                note = '+';
            }
        }

        else if ( score <= 49 ) {
            grade1 = 'E';
        }
        System.out.println("You have grade " + grade1 + note);
        scan.close();    
    }
}