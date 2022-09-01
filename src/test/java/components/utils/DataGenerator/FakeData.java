package components.utils.DataGenerator;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakeData {

    public static String generateWarehouseEmail(String fname,String lname){
        Faker faker=new Faker(new Locale("en-NZ"));
        String emailAddress= "ocapiuser"+faker.number().digits(5)+"@gep-test.com";
        return emailAddress.replaceAll("'","").trim().replace(" ", "") ;
    }

    public static String generateFirstName() {
        Faker faker = new Faker();
        String fname = "ocapi"+faker.name().firstName();
        return fname;
    }
    //Generate Last Name
    public static String generateLastName() {
        Faker faker = new Faker();
        String fname = "ocapi"+faker.name().lastName();
        return fname;
    }
    public static String generateUniquePassword() {
        return "Test1234";
    }

}
