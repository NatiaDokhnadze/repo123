package homework3;
import java.util.Scanner;
public class lesson3task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();

        String[] zodiacAnimals = {
                "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"
        };

        int index = year % 12;
        String zodiac = zodiacAnimals[index];

        System.out.println("Your Chinese Zodiac sign is: " + zodiac);

        scanner.close();
    }


}
