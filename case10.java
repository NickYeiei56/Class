import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int score = scanner.nextInt();
        String grade = thinkGrade(score);
        System.out.println("Your grade is:" + grade);
        scanner.close();
    }

    public static String thinkGrade(int score) {
        if (score < 0 || score > 100) {
            return "Score must be within the range 0-100";
        } else if ((score > 79) && (score < 101)) {
            return "A";
        } else if ((score > 74) && (score < 80)) {
            return "B+";
        } else if ((score > 69) && (score < 75)) {
            return "B";
        } else if ((score > 64) && (score < 70)) {
            return "C+";
        } else if ((score > 59) && (score < 65)) {
            return "C";
        } else if ((score > 54) && (score < 60)) {
            return "D+";
        } else if ((score > 49) && (score < 55)) {
            return "D";
        } else {
            return "E";
        }
    }
}