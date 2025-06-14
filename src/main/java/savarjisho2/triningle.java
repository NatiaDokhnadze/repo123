package savarjisho2;

import java.util.Scanner;

public class triningle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("შეიყვანეთ პირველი გვერდის მონაცემი:");
        int a=scanner.nextInt();

        System.out.println("შეიყვანეთ მეორე გვერდის მონაცემი:");
        int b=scanner.nextInt();

        System.out.println("შეიყვანეთ მესამე გვერდის მონაცემი:");
        int c=scanner.nextInt();

        if (a+b>c && b+c>a && a+c>b) {
            System.out.println("შესაძლებელია სამკუთხედის აგება");

            }else {
            System.out.println("შეუძლებელია სამკუთედის აგება");

        }
    }
}
