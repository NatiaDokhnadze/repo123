package homework9;
// შევქმნათ Rectangle კლასი შემდეგი ველებით
public class Rectangle extends Shape {
    private Point a, b, c, d;
//შევქმნათ კონსტრუქტორი
    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
//გამოვთვალოთ პერიმეტრი
    @Override
    public double calculatePerimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(d) + d.distanceTo(a);
    }
//გამოვთვალოთ ფართობი
    @Override
    public double calculateArea() {
        // შუსელის ფორმულა (Bretschneider's formula)
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double cd = c.distanceTo(d);
        double da = d.distanceTo(a);
        double ac = a.distanceTo(c);
        double bd = b.distanceTo(d);

        double s = (ab + bc + cd + da) / 2.0; // ნახევარპერიმეტრი

        double area = Math.sqrt(
                (s - ab) * (s - bc) * (s - cd) * (s - da)
                        - 0.25 * Math.pow(ab * cd + bc * da - ac * bd, 2)
        );

        return area;
    }
}
