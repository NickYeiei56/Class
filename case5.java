import java.util.Scanner;

public class Case16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Please enter your score 1-100:");

        int score = scanner.nextInt();
        String grade;

        if (score !=0 && score > 79 && score<101) {
            grade = "A";
        }else if (score !=0 && score > 74 && score<101) {
            grade = "B+";
        }else if (score !=0 && score > 69 && score<101) {
            grade = "B";
        }else if (score !=0 && score > 64 && score<101) {
            grade = "C+";
        }else if (score !=0 && score > 59 && score<101) {
            grade = "C";
        }else if (score !=0 && score > 54 && score<101) {
            grade = "D+";
        }else if (score !=0 && score > 49 && score<101) {
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("your grade is " + grade);
        scanner.close();
    }
}