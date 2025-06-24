package test5homework;

public class getElementByIndex {
    public static int getElementByIndex(int[] array, int index) {
        if (index > 0 && index < array.length) {
            return (array[index]);
        } else {
            return (-1);
        }
    }
}
