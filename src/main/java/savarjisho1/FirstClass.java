package savarjisho1;

public class FirstClass {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("გაცვლამდე a=" + a + ", b=" +b);
        //მნიშვნელობების გაცვლის შემდეგ:
        int c= a; //=5
        a=b; //=7
        b=c; //=5
        System.out.println("გაცვლის შემდეგ a=" +a + ",b=" + b +",c=" + c);
    }

}
