package homework9;

//შევქმნათ Circle კლასი შემდეგი ფოინთ ველებით
public class Circle extends Shape {
    private Point center;
    private Point pointOnCircle;

    //შევქმნათ კონსტრუქტორი
    public Circle(Point center, Point pointOnCircle) {
        this.center = center;
        this.pointOnCircle = pointOnCircle;
    }

    //გამოვთვალოთ რადიუსი
    private double getRadius() {
        return center.distanceTo(pointOnCircle);
    }
    //პერიმეტრის და ფართობის გამოთვლა
    @Override
    public double calculatePerimeter() {
        double radius = getRadius();
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        double radius = getRadius();
        return Math.PI * radius * radius;
    }
}
