import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Score :");
        int Score = scanner.nextInt();
        String Grade;
        if ((Score != 79) && (Score >= 80)) {
            Grade = "A";
        }
        else if ((Score != 74) && (Score >= 75)) {
            Grade = "B+";
        }
        else if ((Score !=69) && (Score >= 70)) {
            Grade = "B";
        }
        else if ((Score != 64) && (Score >=65)) {
            Grade = "C+";
        }
        else if ((Score != 59) && (Score >=60)) {
            Grade = "C";
        }
        else if ((Score != 54) && (Score >=55)) {
            Grade = "D+";
        }
        else if ((Score !=49) && (Score >=50)) {
            Grade = "D";
        }
        else{
            Grade = "E";
        }

        System.out.println("The Grade is " + Grade);
        scanner.close();
    }
}