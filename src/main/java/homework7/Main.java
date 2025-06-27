package homework7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();

        String text = "ეს არის პირველი წინადადება. ეს არის მეორე წინადადება. მესამეში არის სიტყვა პროგრამირება. ეს უბრალოდ ტესტია.";
        analyzer.addText(text);

        System.out.println(" წინადადებები, რომლებიც შეიცავს სიტყვას 'პროგრამ':");

        ArrayList<String> results = analyzer.findWordsContaining("პროგრამ");
        for (String sentence : results) {
            System.out.println("- " + sentence);
        }
    }
}
