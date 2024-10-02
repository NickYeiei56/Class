import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Score : ");
        int score = scanner.nextInt();
        String grade;
        if (score < 0 || score > 100) {
            grade = "please enter score 1-100.";
        }
        else if (score >79) {
            grade = "A";            
        }
        else if(score >74){
            grade = "B+";
        }
        else if (score > 69) {
            grade = "B";
        }
        else if (score > 64) {
            grade = "C+";
        }
        else if (score > 59) {
            grade = "C";
        }
        else if (score > 54) {
            grade = "D+";
        }
        else if (score > 49) {
            grade = "D";
        }
        else if (score < 50) {
            grade = "E";
        }
        else{
            grade = "eror please enter score 1-100.";
        }

        System.out.println("you got grade is " + grade);
        scanner.close();
    }
}