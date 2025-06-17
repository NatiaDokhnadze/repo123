package homework6;

public class cat {
   String name;
   private String breed;
    int age;
    String gender;
    int biteSize=10;
    //ვქმნით კონსტრუქტორს:

    public cat() {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }
    //გამოვიყენოთ Getter სახელისთვის:

     String getName() {
        return name;
    }

//setter and getter for gender:
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //შევქმენით მეთოდი 1:
    void meow() {
        System.out.println("meowing...");//დაიბეჭდება ეს.
    }
    //შევქმენით მეთოდი 2:
    void eat(int grams) {
        int bites = grams / 10;  //10-ზე გაყოფით ვითვლით რამდენი სრული ლუკმაა
        if (grams % 10 != 0) {   //ვიგებთ თუ ზუსტად იყოფა ლუკმებად თუ ლუკმის გარდა რჩება ექსტა გრამები
            bites++;  //ყველა შემთხვევაში კიდევ ერთ ლუკამდ შეჭამს
        }

        for (int i = 0; i < bites; i++) {
            System.out.println("eating...");
        }
    }
}
