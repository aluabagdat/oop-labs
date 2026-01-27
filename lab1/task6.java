import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringBuilder reversed = new StringBuilder(input).reverse();
        
        if (input.equals(reversed.toString())) {
            System.out.println("string is a palindrome");
        } else {
            System.out.println("string is NOT a palindrome");
        }
        
        scanner.close();
    }
}
