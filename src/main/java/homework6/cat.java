package homework6;

public class cat {
   private String name;
   private String breed;
   private int age;
   private String gender;
   private int bitSize=10; //პრივატ კლასია და მხოლოდ კლასის შიგნით არის ხელმისაწვდომი

    //კონსტრუქტორი
    public cat(String name, String breed, int age, String gender, int bitSize) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.bitSize = bitSize;
    }
    //ვიყენებთ getter ასაკისთვის
    public int getAge() {
        return age;
    }
    //ვიყენებთ getter and setter ნეიმისთვის
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ვიყენებთ getter ჯიშისთვის
    public String getBreed() {
        return breed;
    }
    //ვიყენებთ getter and setter სქესისთვის

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //შევქმნათ მეთოდი makeSound()
    public void makeSound() {
        System.out.println("mewing");
    }

    //შევქმნათ მეთოდი eat(int grams)
    public void eat(int grams) {
        int bite = grams/10; //ვიგებთ ერთი ლუკმა რამდენი გრამია
        if (grams % 10 !=0) {//10 გრამიან ლუკმებად დაყოფისას რჩება თუ არა გრამები
        bite ++;
    }
        for (int i =0;i < bite; i++) {
            System.out.println("eating...");
        }
        }
}





