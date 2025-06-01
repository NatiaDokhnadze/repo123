package homework3;

import java.util.Scanner;

public class myhomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter integer number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number you have entered is 12 and it is even");
        } else {
            System.out.println("The number you have entered is 12 and it is odd");
        }
    }
}
