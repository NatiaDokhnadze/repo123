package homework6;

public class runner {
    public static void main(String[] args) {
        cat cat1 =new cat();
        cat1.name="Tom";
        cat1.age=4;
        cat1.gender="male";
        System.out.println("My cat's name is  " + cat1.name);
        System.out.println("And He is " + cat1.age + "years old");

        System.out.println(cat1.getName());
        cat1.setGender("Garfild");
        System.out.println(cat1.getGender());
        cat1.meow();
        cat1.eat(25);


    }

}
