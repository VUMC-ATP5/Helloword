package lekcijaSesiTest.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc" + vards);
        System.out.println(faker.shakespeare().romeoAndJulietQuote());

    }
}
