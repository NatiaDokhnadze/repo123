package homework4;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("შეიყვანეთ მასივის ზომა");
        int size=scanner.nextInt(); //მასივის ზომა
        String[] array =new String[size];//სტრინგის ტიპის მასივი
        for (int i=0; i<size; i++) {
            System.out.println("შეიყვანეთ ინდექსი" + i + ":");
            array[i]=scanner.nextLine();
        }
        // თუ მხოლოდ ერთხელ გვხვდება
        System.out.println("დავბეჭდოთ უნიკალური ელემენტები:");
        for (int i=0; i<size; i++) {
        String current=array[i];
        int count=0;
        for (int j=0; j<size; j++){
            if (array[j].equals(current)) {
                count++;
            }
            if (count == 1) {
                System.out.println(current);
            }
        }



        }

    }
}