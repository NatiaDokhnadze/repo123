package test5homework;

public class task1 {
    //სთრინგის დაბეჭდვა
    public static void print(String message) {
        System.out.println(message);
    }

    //რიცხვის დაბეჭდვა
    public static void print(int number) {
        System.out.println(number);
    }

    //მასივის ლამაზი დაბეჭდვა
    public static void print(int[] array) {
        System.out.println('[');

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i < array.length - 1) {
                System.out.println(",");
            }
        }
        System.out.println(']');
    }
    // ტექსტი + რიცხვი ერთ ხაზზე
    public static void print(String message, int number) {
        System.out.println(message + number);
    }
    //ტექსტი + მასივი
    public static void print(String message,int [] array) {
        System.out.println(message + array);
    }
}
