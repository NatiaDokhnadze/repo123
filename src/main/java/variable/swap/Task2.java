package variable.swap;

public class Task2 {

    public static void main(String[] args) {

        int year=2024;
        boolean P1 = year % 4 ==0;
        boolean P2 = year % 100 != 0;
        boolean P3 = year % 400 ==0;

        boolean isLeapYear = P1 && (P2 || P3);
System.out.println(isLeapYear);


    }
}
