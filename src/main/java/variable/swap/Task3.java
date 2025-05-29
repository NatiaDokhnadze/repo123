package variable.swap;

public class Task3 {
    public static void main(String[] args) {

        boolean P = true;

        System.out.println("operationsWithOR");
        System.out.println("P | P = " + (P | P));
        System.out.println("P | true=" + (P | true)); // P|1  1=true
        System.out.println("P | false=" + (P | false)); //P|0  0=false
        System.out.println("P | !P=" + (P | !P)); //P|!P

        System.out.println("operationsWithAND");
        System.out.println("P & P=" + (P & P));
        System.out.println("P & true=" + (P & true));
        System.out.println("P & false=" + (P & false));

        System.out.println("mixedoprations");
        System.out.println("P | P & false = " + (P | P & false));
        System.out.println("P | P & true=" +(P | P & true));
        System.out.println("P & P | true=" +(P & P | true));
        System.out.println("P & P | false=" +(P & P | false));



    }
}
