package homework7;

import java.util.ArrayList; //ვაიმპორტებთ ერაის

//შევქმენით მეთოდი შემდეგი ცვლადებით:
public class TextAnalyzer {
    private ArrayList<String> sentences;// წინადადებების სია
    private StringBuilder report;//ტექსტის ასაწყობად ვიყენებთ
//ვქმნით კონსტრუქტორს
    public TextAnalyzer() {
        sentences = new ArrayList<>(); //წინადადებების შესანახად
        report = new StringBuilder(); //რეპორტების შესაქმნელად
    }

    public void addText(String text) {
        String[] splitSentences = text.split("\\."); // წერტილით ვყოფთ წინადადებებს

        for (String sentence : splitSentences) {//ციკლით გადავდივართ ყოველ მომდევნო წინადადებაზე
            sentence = sentence.trim(); // ვშლით ცარლიელ ადგილებს წინადადების თავში და ბოლოში
            if (!sentence.isEmpty()) { //ამ კოდით ვიგებთ თუ ცარიელი არაა წინადდადება
                sentences.add(sentence); //თუ ცარიელი არაა მაშინ ვამატებთ ტექსტს
                report.append("Added sentence: ").append(sentence).append("\n"); //რეპორტებში ვამატებთ ინფოს
                                                                                //რომ წინადადება დავამატეთ.
            }
        }
    }
//ეს მეთოდი აბრუნებს წინადადებების სიას
    public ArrayList<String> getSentences() {
        return sentences;
    }
//ეს მეთოდი აბრუნებს რეპორტებს
    public StringBuilder getReport() {
        return report;
    }
}



