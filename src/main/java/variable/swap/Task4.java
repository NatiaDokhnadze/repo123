package variable.swap;

public class Task4 {
    public static void main(String[] args) {

       int A=10;
       int B=5;
       int C=2;

        if (A > B && B > C) {
            System.out.println("A > B > C");
        } else if (A < B && B < C) {
            System.out.println("A < B < C");
        } else if (A > B && C > (A + B)) {
            System.out.println("A > B && C > (A + B)");
        } else {
            System.out.println("No condition met");
        }

        int temp = A;
        A = C;
        C = temp;

        System.out.println("მნიშვნელობების შეცვლა");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
    }
}


