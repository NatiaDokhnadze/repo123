package variable.swap;

public class SwapExample {

    public static void main(String[] args) {

        int a=5;
        int b=7;
        System.out.println("a=" +a);
        System.out.println("b=" +b);

        //მესამე ცვლადის დამატება
        int c = a;
        a = b;
        b = c;
        System.out.println("c=" +c);
        System.out.println("b=" +b);

    }
}
