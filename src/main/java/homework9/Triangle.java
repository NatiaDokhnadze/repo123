package homework9;

//შევქმნათ სამკუთხედის აბსტრაქტული კლასი (Shape ის შვილობილი)
public class Triangle  extends Shape {
    private Point a;
    private Point b;
    private Point c;
//კონსტრუქტორი
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//პერიმეტრის გამოთვლა
    @Override
    public double calculatePerimeter() {
        double sideAB = a.distanceTo(b);
        double sideBC = b.distanceTo(c);
        double sideCA = c.distanceTo(a);
        return sideAB + sideBC + sideCA;
    }
//ფართობის გამოთვლა
    @Override
    public double calculateArea() {
        // Using Heron's formula
        double sideAB = a.distanceTo(b);
        double sideBC = b.distanceTo(c);
        double sideCA = c.distanceTo(a);
        double s = (sideAB + sideBC + sideCA) / 2.0;
//ფართობის ფორმულა
        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }
}
