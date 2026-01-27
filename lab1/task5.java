import java.util.Scanner;

public class InterestCalculatorInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("initial balance = ");
        double initialBalance = scanner.nextDouble();
        System.out.print("interest rate (%) = ");
        double interestRate = scanner.nextDouble();
        
        double interest = initialBalance * (interestRate / 100);
        double newBalance = initialBalance + interest;
        
        System.out.println("initial balance =" + initialBalance);
        System.out.println("interest rate = " + interestRate + "%");
        System.out.println("interest = " + interest);
        System.out.println("new balance = " + newBalance);
        
        scanner.close();
    }
}
