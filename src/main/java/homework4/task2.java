package homework4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("შეიყვანეთ მასივის ზომა");
        int size = scanner.nextInt(); //მასივის ზომის შეყვანა
        int[] array = new int[size]; //მასივის შექმნა
        for (int i =0; i< size; i++) {
            System.out.println("enter number" + i + ":");
            array[i] = scanner.nextInt();}
            //ნამრავლის გამოთვლა
            int product =1;
        for (int i = 0; i < size; i++) {
            product = product * array[i]; } //რიცხვების ნამრავლი
        System.out.println("ელემენტის ნამრავლი:" + product);


    }
}
