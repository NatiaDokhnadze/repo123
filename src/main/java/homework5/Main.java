package homework5;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // მასივის დაბეჭდვა
        ArrayFunctions.print("მთელი მასივი:", numbers);

        // სწორი ინდექსით ელემენტის მიღება
        int elementAt2 = ArrayFunctions.getElementByIndex(numbers, 2);
        ArrayFunctions.print("ელემენტი ინდექსზე 2: ", elementAt2);

        // არასწორი ინდექსი
        int elementAt10 = ArrayFunctions.getElementByIndex(numbers, 10);
        ArrayFunctions.print("ელემენტი ინდექსზე 10: ", elementAt10);
    }
}

