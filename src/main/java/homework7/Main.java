package homework7;

public class Main {
    //აქედან ვიწყებთ პროგრამას
    public static void main(String[] args) {
        //შევქმენით ობიექტი TextAnalyzer მისი ფუნქციები რომ გამოვიყენოთ
        TextAnalyzer analyzer = new TextAnalyzer();
//ვწერთ რამდენიმე წინადადებას რომ მერე ბილდერით ავაწყოთ
        String inputText = "Here must be text.MY name is Natia.I live in Spain";
        analyzer.addText(inputText);
//ვბეჭდავთ ყველა წინადადებას ცალ-ცალკე.
        System.out.println("Sentences:");
        for (String sentence : analyzer.getSentences()) {
            System.out.println(sentence);
        }
//ბოლოს ვბეჭდავთ რეპორტს, სადაც ჩანს რომელი წინადადებები დაემატა.
        System.out.println("\nReport:");
        System.out.println(analyzer.getReport());
    }
}
