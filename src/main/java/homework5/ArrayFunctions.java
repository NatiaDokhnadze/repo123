package homework5;

public class ArrayFunctions {
    //სთრინგის დაბეჭდვა //overloads
    public static void print(String message) {
        System.out.println(message);
    }

    //რიცხვის დაბეჭდვა
    public static void print(int number) {
        System.out.println(number);
    }

    //მასივის ლამაზად დაბეჭდვა
    public static void print(int[] array) {
        System.out.println('[');
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //ტექსტი + რიცხვი ერთ ხაზზე დაბეჭდვა
    public static void print(String message, int number) {
        System.out.println(message + number);
    }

    //ტექსტი + მასივის დაბეჭდვა ერთ ხაზზე
    public static void print(String message, int[] array) {
        System.out.println(message + array);
    }

    //დავალება პირველი

    //ობიექტის შექმნა
    public static int getElementByIndex(int[] array, int index) {
        //ინდექსი უნდა აკმაყოფილებდეს ამ მოთხოვნებს
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return -1; // არასწორი ინდექსის შემთხვევაში დააბრუნოს -1
        }
    }
}