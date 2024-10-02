public class Case8 {
    public static void main(String[] args) {

        int score = 0;
        String grade = "";
        if (score >= 75) {
            if (score >= 80) {
                grade = "A";
            } else {
                grade = "B+";
            }
        } else {
            if (score >= 70) {
                grade = "B";
            } else {
                if (score >= 65) {
                    grade = "C+";
                } else {
                    if (score >= 60) {
                        grade = "C";
                    } else {
                        if (score >= 55) {
                            grade = "D+";
                        } else {
                            if (score >= 50) {
                                grade = "D";
                            } else {
                                grade = "E";
                            }
                        }
                    }
                }
            }

        }
        System.out.println("your grade is :" + grade);
    }
}