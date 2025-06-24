package homework5;

import static homework5.MinMax.createAndFillArray;
import static homework5.MinMax.findMinMax;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // სწორი ინდექსით ელემენტის დაბეჭდვა
        int elementAt2 = ArrayFunctions.getElementByIndex(numbers, 2);
        ArrayFunctions.print("ელემენტი ინდექსზე 2: ", elementAt2);

        // არასწორი ინდექსით დაბეჭდვა
        int elementAt10 = ArrayFunctions.getElementByIndex(numbers, 10);
        ArrayFunctions.print("ელემენტი ინდექსზე 10: ", elementAt10);


        createAndFillArray();
    }

    }




