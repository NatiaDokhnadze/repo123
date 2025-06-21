package homework6;

public class runner2 {
    public static void main(String[] args) {
Triangle Triangle =new Triangle(3,4,5);
        Triangle.printside();
        System.out.println("სამკუთხედის პერიმეტრი არის:  " + Triangle.getPerimeter());
        System.out.println("სამკუთხედის ფართობი არის:  " + Triangle.getArea());
    }
}
