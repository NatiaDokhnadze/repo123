package savarjisho2;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("შეიყვანეთ მონაცემები");
        int number=scanner.nextInt(); //როცა ინტის მნიშვნელობას ვინახავთ ან შეგვაქ სკანერში

        //განვსაზღვროთ რიცხვი ლუწია თუ კენტი
        if (number % 2==0)
        {
            System.out.println(number + "არის ლუწი");
        }
        else{
            System.out.println(number + "არის კენტი");
        }
    }
}
