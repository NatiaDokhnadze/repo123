package savarjisho1;

public class Flow {
    public static void main(String[] args) {
        int a=40;
        int b=20;
        int c=30;
        System.out.println("a=" + a + ", b=" + b  + ", c=" + c);
        if (a>b && b>c){
            System.out.println("a>b>c");

        }
        else if (a<b && b<c){
            System.out.println("a < b < c");
        }
        else if (a>b && c>(a+b)) {
            System.out.println("A > B && C > (A + B)");
        }
        else{
            System.out.println("wrong");
        }
int y=a;
        a=b;
        c=c;
        b=y;
        System.out.println("a=" +a+ ", b=" +b+ ", c=" +c);
        if (a>b && b>c){
            System.out.println("a>b>c");

        }
        else if (a<b && b<c){
            System.out.println("a < b < c");
        }
        else if (a>b && c>(a+b)) {
            System.out.println("A > B && C > (A + B)");
        }
        else{
            System.out.println("wrong");
        }
        }

}
