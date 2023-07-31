package lesson9;

public class Italian extends Person{
    public Italian(String name, String sex, String religion, boolean job, String egn, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", egn, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao");
    }

    public void makePizza() {
        System.out.println("I am making pizza");
    }
}
