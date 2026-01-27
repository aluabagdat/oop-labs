import java.util.Scanner;

public class SquareProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("the side length of square");
        double side = scanner.nextDouble();
        
        double area = side * side;
        double perimeter = 4 * side;
        double diagonal = side * Math.sqrt(2);
        
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("diagonal = " + diagonal);
        
        scanner.close();
    }
}
