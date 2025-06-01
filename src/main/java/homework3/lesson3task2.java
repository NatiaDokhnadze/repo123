package homework3;
import java.util.Scanner;
public class lesson3task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side:");
        int a = scanner.nextInt();

        System.out.println("Enter second side:");
        int b = scanner.nextInt();

        System.out.println("Enter third side:");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("It is possible to form a triangle.");
        } else {
            System.out.println("It is NOT possible to form a triangle.");
        }

        scanner.close();
    }
}
