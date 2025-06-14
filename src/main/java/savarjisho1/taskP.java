package savarjisho1;
// or ის შემთხვევაში
public class taskP {
    public static void main(String[] args) {
        boolean p1 =true;
        System.out.println("p | p=" + (p1 | p1));
        System.out.println("p | 0" + (p1 | false ));
        System.out.println("p | 1" + (p1 | true));
        System.out.println("p | not p=" + (p1 | !p1));
// and ის შემთხვევაში
        boolean p2=false;
        System.out.println("P & P =" + (p2 & p2));
        System.out.println("P & 0 =" + (p2 & false));
        System.out.println("P & 1" + (p2 & true));
        System.out.println("P & not P =" + (p2 & !p2));
        //ორივეს შემთხვევაში
        System.out.println("P & P | 0 =" + (p1 &p1 | false));
        System.out.println("P & P | 0 =" +(p1 & p2 | false));
        System.out.println("P & P | 1 =" +(p1 & p2 | true));
        System.out.println("P | P & 1" + (p1 |p2 & true));
        System.out.println("P | P & 0=" + (p1 |p2 & false));

    }
}
