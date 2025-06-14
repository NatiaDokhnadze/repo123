package testwork5;

public class overloads {
    public static void main(String[] args) {
    }

    //ა) სტრინგის დაბეჭდვა
    public static void print(String message) {
        System.out.println(message);
    }

    //ბ) int რიცხვის დაბეჭდვა
    public static void print(int number) {
        System.out.println(number);
    }

    //გ) მასივის ლამაზად ბეჭდვა
    public static void print(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {// ელემენტს ვაძლევთ მნიშვნელობას
            System.out.println(array[i]); //ელემენტის ბეჭდვა
            if (i < array.length - 1) { //ბოლოში რომ მძიმე არ დაწეროს
                System.out.println(",");
            }
            System.out.println("]");//მასივის დასასრული
        }
    }
    // დ) ტექსტის და რიცხვის ერთ ხაზზე დაბეჭდვა
    public static void print(String message,int value) {
        System.out.println(message + value );
    }
    // ე)ტექსტისა და ინტ მასივის ერთ ხაზზე დაბეჭდვა
    public static void print(String message,int [] array) {
        System.out.println(message + array);
    }
}