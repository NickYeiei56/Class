import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับคะแนนจากผู้ใช้
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        // คำนวณเกรด
        String grade;
        if (score > 79) {
            grade = "A";
        } else if (score > 74) {
            grade = "B+";
        } else if (score > 69) {
            grade = "B";
        } else if (score > 64) {
            grade = "C+";
        } else if (score > 59) {
            grade = "C";
        } else if (score > 54) {
            grade = "D+";
        } else if (score > 49) {
            grade = "D";
        } else {
            grade = "E";
        }

        boolean isPass = (grade != "E");

        System.out.println("Your grade is: " + grade);
        System.out.println("Check grade status: " + isPass);
        scanner.close();
    }
}