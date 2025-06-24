package homework5;

import java.util.Scanner;

public class MinMax {
    public static int[] createAndFillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ მასივის ზომა:  ");
        int size = scanner.nextInt();

        //შევქმნათ მასივი
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("შეიყვანეთ მასივის წევრი" + i);
            array[i] = scanner.nextInt();// შეინახოს i-ის მონაცემები
        }
        ArrayFunctions.print("სრული მასივი: " , array);

        return array;
    }
    public static int[] findMinMax(int[] array) {
        int min =array[0];
        int max = array[0];
        for(int num : array){
            if (num<min) {
                min=num;
            }
            if (num>max) {
                max=num;
            }
        }

        int[] result={min,max};
        ArrayFunctions.print("დავბეჭდოთ მიონიმალური და მაქსიმალური მნიშვნელობები:" , result);
        return result;
    }

}



