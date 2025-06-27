package homework9;
    public class Main {
        public static void main(String[] args) {
            // შევქმნათ ფიგურები
            Shape[] shapes = new Shape[3];

            shapes[0] = new Circle(new Point(0, 0), new Point(0, 5));
            shapes[1] = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
            shapes[2] = new Rectangle(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));

            // ლუპით მასივი
            for (Shape shape : shapes) {
                System.out.println("ფიგურის პერიმეტრი: " + shape.calculatePerimeter());
                System.out.println("ფიგურის ფართობი: " + shape.calculateArea());
            }
        }
    }

