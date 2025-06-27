package homework7;

import java.util.ArrayList;

public class TextAnalyzer {
    private ArrayList<String> sentences;
    private StringBuilder report;

    public TextAnalyzer() {
        this.sentences = new ArrayList<>();
        this.report = new StringBuilder();
    }

    public void addText(String text) {
        String[] splitSentences = text.split("\\.");
        for (String sentence : splitSentences) {
            String trimmed = sentence.trim();
            if (!trimmed.isEmpty()) {
                sentences.add(trimmed);
            }
        }
    }

    public ArrayList<String> getSentences() {
        return sentences;
    }

    public String generateWordReport(int index) {
        if (index < 0 || index >= sentences.size()) {
            return "წინადადება ვერ მოიძებნა: ინდექსი " + index;
        }

        String sentence = sentences.get(index);
        String[] words = sentence.split("\\s+");

        int wordCount = words.length;
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        report.setLength(0);
        report.append(" სიტყვების სტატისტიკა წინადადებაზე [")
                .append(index)
                .append("]:\n");
        report.append(" წინადადება: ").append(sentence).append("\n");
        report.append(" სიტყვების რაოდენობა: ").append(wordCount).append("\n");
        report.append(" ყველაზე გრძელი სიტყვა: ").append(longestWord);

        return report.toString();
    }

    public ArrayList<String> findWordsContaining(String pattern) {
        ArrayList<String> matchedSentences = new ArrayList<>();
        String lowerCasePattern = pattern.toLowerCase();

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(lowerCasePattern)) {
                matchedSentences.add(sentence);
            }
        }

        return matchedSentences;
    }
}

