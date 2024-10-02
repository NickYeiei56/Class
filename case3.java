import java.util.Scanner;

public class Case3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ยินดีต้อนรับสู่โปรแกรมคำนวนเกรด!");
        System.out.print("Please enter your score (0-100): ");
        
        if (scanner.hasNextDouble()) {
            double score = scanner.nextDouble();

            if (score >= 0 && score <= 100) {
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
                } else{
                    grade = "E";
                }

                System.out.println("Your grade is: " + grade);
            } else {
                System.out.println("Error: Score must be between 0 and 100.");
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a numeric score.");
        }
        
        scanner.close();
    }
}