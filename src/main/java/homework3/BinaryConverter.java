package homework3;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Only positive integers are allowed.");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }
    }
}