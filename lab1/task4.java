import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter coefficients: ");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            System.out.println("doesnt have real roots");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("equation has only one root: x = " + x);
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double twoA = 2 * a;
            double x1 = (-b + sqrtD) / twoA;
            double x2 = (-b - sqrtD) / twoA;
            System.out.println("equation has two roots: x1 = " + x1 + ", x2 = " + x2);
        }
        
        scanner.close();
    }
}
