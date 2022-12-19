package dataGenerator;

import com.github.javafaker.Faker;

public class DataCreation {

    public static String generateEmail(){
        return new Faker().internet().emailAddress();
    }
    public static String generatePassword(){
        return new Faker().internet().password(6, 10, true, true,
                true);
    }

    public static String generateFirstName(){
        return new Faker().name().firstName();
    }
}
