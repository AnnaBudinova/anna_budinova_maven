package lesson9;

public class American extends Person{
    public American(String name, String sex, String religion, boolean job, String egn, String countryOfResidence) {
        super(name, sex, religion, "English", job, "USA", egn, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
    public void eatHotDog() {
        System.out.println("I am eating HotDog");
    }
}

