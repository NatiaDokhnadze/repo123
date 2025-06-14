package savarjisho2;

import java.util.Scanner;

public class numberCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ მონაცემი");
        //რიცხვის შეტანა
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i; //რიცხვის კუბი
            System.out.println(i + "-ს კუბი არის: " + cube);

        }
    }
}
