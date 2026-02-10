package lab1;

import practice2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course course = new Course(
                "CS101 Object-Oriented Programming",
                "OOP and Design",
                5
        );

        GradeBook gradeBook = new GradeBook(course);
        gradeBook.displayMessage();

        System.out.println("\nPlease, input grades for students:");

        for (char c = 'A'; c <= 'J'; c++) {
            System.out.print("Student " + c + ": ");
            int grade = sc.nextInt();
            gradeBook.addStudent(new Student("Student " + c, grade));
        }

        System.out.println();
        gradeBook.displayGradeReport();
    }
}
