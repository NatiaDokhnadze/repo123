package homework4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // რიგების რაოდენობის შეყვანა
        System.out.println("შეიყვანეთ მწკრივების რაოდენობა:");
        int rows = scanner.nextInt();

        // სვეტების რაოდენობის შეყვანა
        System.out.print("შეიყვანეთ სვეტების რაოდენობა: ");
        int column = scanner.nextInt();

        // ორგანზომილებიანი მასივის შექმნა
        int [][] matrix  = new int [rows][column];

        // მონაცემებით შევსება
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < column; j++) {
                System.out.print("შეიყვანეთ ელემენტი მატრიცისთვის [" + i + "][" + j + "]: ");
                matrix [i][j] = scanner.nextInt();
            }
        }
        // მატრიცის დაბეჭდვა
        System.out.println("მატრიცა:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
        }
    }
}
