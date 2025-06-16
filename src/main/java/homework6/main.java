package homework6;

public class main {
    public static void main(String[] args) {
        // ვქმნით კატას ობიექტს
        Cat myCat = new Cat("Murka", "Persian", 3, "Female");

        // ვტესტავთ მეთოდებს
        System.out.println("Name: " + myCat.getName());
        System.out.println("Breed: " + myCat.getBreed());
        System.out.println("Age: " + myCat.getAge());
        System.out.println("Gender: " + myCat.getGender());

        // ხმა
        myCat.makeSound();

        // ჭამა
        myCat.eat(25);  // უნდა დაიბეჭდოს eating... 3-ჯერ
    }
}
    }
}
