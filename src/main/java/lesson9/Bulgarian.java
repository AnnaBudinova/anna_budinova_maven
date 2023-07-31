package lesson9;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, boolean job, String egn, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", egn, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравей");
    }

    public void danceHoro() {
        System.out.println("I am dancing horo");
    }
}

