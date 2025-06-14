package savarjisho1;

public class LeapYear {
    public static void main(String[] args) {
        int year=2000;
        boolean isleap=true;
        isleap= (year %4==0 && year %100 !=0);
        System.out.println(isleap);
    }
}
