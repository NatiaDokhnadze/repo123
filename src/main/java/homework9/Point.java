package homework9;

public class Point {
    //შევქმნათ კლასი შემდეგი ველებით
    private double x;
    private double y;
    //შევქმნათ კონსტრუქტორი

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //შევქმნათ მეთოდი  ორ წერტილს შორის მანძილის გამოსათვლელად
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
