package savarjisho2;

public class sum {
    public static void main(String[] args) {
        // ჯამის ცვლადი:
        int sum=0;

        //რიცხვების ციკლი
        for(int i=0; i<=10; i++) {
            sum+=i;
        }
        //შედეგის ბეჭდვა
        System.out.println("რიცხვების ჯამი არის " + sum);
    }
}
