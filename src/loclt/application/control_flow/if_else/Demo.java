package loclt.application.control_flow.if_else;

public class Demo {
    public static void main(String[] args) {
        int testScore = 76;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 60) {
            grade = 'C';
        } else if (testScore >= 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
