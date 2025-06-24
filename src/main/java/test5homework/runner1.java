package test5homework;

import test5homework.getElementByIndex;

public class runner1 {
    public static void main(String[] args) {
        int[] array = {10, 12, 13, 14, 15};
//სწორი ინდექსით რიცხვის დაბეჭდვა
        int elementAt2 =getElementByIndex.getElementByIndex(array, 2);
        task1.print("ელემენტი ინდექსზე 2: ", elementAt2);

        //არასწორი ინდექსით დაბეჭდვა
        int elementAt7 = getElementByIndex.getElementByIndex(array, 7);
        task1.print("ელემენტი ინდექსზე 7: ", elementAt7);
    }

}
