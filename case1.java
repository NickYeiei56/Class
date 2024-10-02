import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Score : ");
        int score = scanner.nextInt();
        String grade;
        if (score < 0 || score >= 101) {
            grade = "please enter score 1-100.";
        }
        else if (score >=80) {
            grade = "A";            
        }
        else if(score >=75){
            grade = "B+";
        }
        else if (score >= 70) {
            grade = "B";
        }
        else if (score >= 65) {
            grade = "C+";
        }
        else if (score >= 60) {
            grade = "C";
        }
        else if (score >= 55) {
            grade = "D+";
        }
        else if (score >= 50) {
            grade = "D";
        }
        else if (score <= 49) {
            grade = "E";
        }
        else{
            grade = "eror please enter score 1-100.";
        }

        System.out.println("you got grade is " + grade);
        scanner.close();
    }
}