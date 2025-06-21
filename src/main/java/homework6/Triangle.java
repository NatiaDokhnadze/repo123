package homework6;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private boolean isvalid;

    // კონსტრუქტორი
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        // ვალიდაციის შემოწმება
        if (side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1) {
            isvalid = true;
        } else {
            isvalid = false;
        }
    }

    // პერიმეტრი
    public double getPerimeter() {
        if (!isvalid) {
            return -1;
        }
        return side1 + side2 + side3;
    }

    // ფართობი
    public double getArea() {
        if (!isvalid) {
            return -1;
        }
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // ვალიდურობის შემოწმება (დამხმარე მეთოდი)
    public boolean isValid() {
        return isvalid;
    }
    public void printside() {
        System.out.println("გვერდი1 არის: " + side1);
        System.out.println("გვერდი2 არის: " + side2);
        System.out.println("გვერდი3 არის: " + side3);
    }
}
