import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your score");
        int score = scanner.nextInt();
        
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 85 && score <= 89) {
            grade = "A-";
        } else if (score >= 80 && score <= 84) {
            grade = "B+";
        } else if (score >= 75 && score <= 79) {
            grade = "B";
        } else if (score >= 70 && score <= 74) {
            grade = "B-";
        } else if (score >= 65 && score <= 69) {
            grade = "C+";
        } else if (score >= 60 && score <= 64) {
            grade = "C";
        } else if (score >= 55 && score <= 59) {
            grade = "C-";
        } else if (score >= 50 && score <= 54) {
            grade = "D+";
        } else if (score >= 45 && score <= 49) {
            grade = "D";
        } else if (score >= 0 && score <= 44) {
            grade = "F";
        } else {
            grade = "invalid score";
        }
        
        System.out.println("your grade: " + grade);
        scanner.close();
    }
}
