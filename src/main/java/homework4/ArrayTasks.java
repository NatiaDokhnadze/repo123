package homework4;

import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ მასივის ზომა:");
        int size = scanner.nextInt();
        scanner.nextLine(); // ეს ხაზი აუცილებელია, რომ მოიშოროს "Enter" შემდეგ nextInt-ის

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("შეავსეთ ინდექსი " + i + ":");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                array[i] = "-";
            } else {
                array[i] = input;
            }
        }

        System.out.println("\n🔽 მასივის ელემენტები:");
        for (int j = 0; j < size; j++) {
            System.out.println("ელემენტი " + j + ": " + array[j]);
        }

        scanner.close();
    }
}




