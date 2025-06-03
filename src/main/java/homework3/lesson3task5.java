package homework3;
import java.util.Scanner;
public class lesson3task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + "^3 = " + cube);
        }

        scanner.close();
    }
}


