package homework5;

import java.util.Arrays;

public class task1 {
    // ა) String დაბეჭდვა
    public static void print(String message) {
        System.out.println(message);
    }

    // ბ) int რიცხვის დაბეჭდვა
    public static void print(int number) {
        System.out.println(number);
    }

    // გ) int მასივის ლამაზი დაბეჭდვა
    public static void print(int[] array) {
        System.out.print("["); // ბეჭდავს დასაწყისს
        for (int i = 0; i < array.length; i++) { //შეგვყავს ელემენტები
            System.out.print(array[i]); //ბეჭდავს ელემენტებს
            if (i < array.length - 1) {
                System.out.print(", "); //გამოყოფს მძიმით
            }
        }
        System.out.println("]"); //ბეჭდავს დასასრულს
    }

    // დ) ტექსტის და რიცხვის ერთ ხაზზე დაბეჭდვა
    public static void print(String message, int value) {
        System.out.println(message + value);
    }

    // ე) ტექსტისა და ინტ მასივის ერთად დაბეჭდვა
    public static void print(String message, int[] array) {
        System.out.println(message + array);
    }

    // სატესტო მაგალითი:
    public static void main(String[] args) {
        print("Hello");
        print(123);
        print(new int[]{1, 2, 3});
        print("Value: ", 42);
        print("Array: ", new int[]{4, 5, 6});
    }
}
