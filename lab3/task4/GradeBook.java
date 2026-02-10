package lab3;

import practice2.Student;
import java.util.ArrayList;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public void displayGradeReport() {
        System.out.printf("Class average is %.2f%n", calculateAverage());
        System.out.println("Lowest grade is " + getLowestStudent());
        System.out.println("Highest grade is " + getHighestStudent());
        outputBarChart();
    }

    private double calculateAverage() {
        int sum = 0;
        for (Student s : students)
            sum += s.getGrade();
        return (double) sum / students.size();
    }

    private Student getLowestStudent() {
        Student min = students.get(0);
        for (Student s : students)
            if (s.getGrade() < min.getGrade())
                min = s;
        return min;
    }

    private Student getHighestStudent() {
        Student max = students.get(0);
        for (Student s : students)
            if (s.getGrade() > max.getGrade())
                max = s;
        return max;
    }

    private void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] freq = new int[11];

        for (Student s : students)
            freq[s.getGrade() / 10]++;

        for (int i = 0; i < freq.length; i++) {
            if (i == 10)
                System.out.print("100: ");
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int j = 0; j < freq[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return course.toString() + "\nStudents: " + students.size();
    }
}
