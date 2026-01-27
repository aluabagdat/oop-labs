import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your name : ");
        String name = scanner.nextLine();

        int length = name.length();
        int width = length;
        
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        System.out.println("| " + name + " |");
        
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        scanner.close();
    }
}
