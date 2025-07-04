package GugasHomework;

public class FunnyTask {
    public static void main(String[] args) throws InterruptedException { //ამას ვიყენებთ რადგან ვიყენებთ sleep-ს
        String word = "ნათია";//ვქმნით ცვლადს word რომელსაც ვანიჭებთ მნიშვ. ნათიას
        int repeatCount = 10; //ვქმნით ცვლადს რომ მივანიჭოთ რიცხვი რამდენჯერაც გვინდა დაიბეჭდოს მოც.სიტყვა
        for (int i = 0; i < repeatCount; i++) { //ვბეჭდავთ ამ სიტყვას 10ჯერ

            for (char ch : word.toCharArray()) { //ch ბეჭდავს თითო ასოს
                System.out.print(ch);//ბეწდავს ასოებს
                Thread.sleep(200); //თითო ასოს შემდეგ პაუზა
            }
            System.out.println();
            Thread.sleep(500); // პაუზა სიტყვებს შორის
        }
    }
}
