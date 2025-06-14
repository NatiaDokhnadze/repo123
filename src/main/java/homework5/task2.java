package homework5;

public class task2 {
    //ვქმნით ფუნქციას getElementByIndex -ის სახელწოდებით
    public static int getElementByIndex(int[] array, int index) {
        if (index>=0 && index <array.length) { //ინდექსი უნდა აკმაყოფილებდეს ამ მონაცემებს
            return array[index]; //მაშინ დაიბეჭდება მასივიდან ინდექსის შესაბამისი რიცხვი
        }else {
            return -1; //თუ ინდექსი არ ემთხვევა მონაცემებს დააბრუნოს -1
        }
    }

    public static void main(String[] args) {
        int [] numbers = {1, 3, 4, 15, 13, 23, 98}; //შევქმენით მასივი და შევიტანეთ მნიშვნელობები
        System.out.println(getElementByIndex(numbers,4));//დავბეჭდოთ 4 ინდექსზე მყოფი ელემენტი
        System.out.println(getElementByIndex(numbers, 7)); //დავბეჭდოთ არასწორი ინდექსი
    }
}
