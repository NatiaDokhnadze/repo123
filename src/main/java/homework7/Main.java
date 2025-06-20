package homework7;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();

        String inputText = "Here must be text";
        analyzer.addText(inputText);

        System.out.println("Sentences:");
        for (String sentence : analyzer.getSentences()) {
            System.out.println(sentence);
        }

        System.out.println("\nReport:");
        System.out.println(analyzer.getReport());
    }
}
