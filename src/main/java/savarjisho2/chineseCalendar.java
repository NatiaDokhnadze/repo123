package savarjisho2;

import java.util.Scanner;

public class chineseCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your birth year");
        int year = scanner.nextInt();
        //მონაცემების შეყვანა
        String[] zodiac= {
                "Rat",      // 0
                "Ox",       // 1
                "Tiger",    // 2
                "Rabbit",   // 3
                "Dragon",   // 4
                "Snake",    // 5
                "Horse",    // 6
                "Sheep",    // 7
                "Monkey",   // 8
                "Rooster",  // 9
                "Dog",      // 10
                "Pig"       //11
        };
        //12 წლიანი ციკლის გამოთვლა
        int index= year % 12;
        String Myzodiac= zodiac[index];
        System.out.println("my zodiac is " + Myzodiac);
        }

    }
