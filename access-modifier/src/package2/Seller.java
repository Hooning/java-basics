package package2;

import package1.Person;

import java.time.LocalDate;

public class Seller extends Person {

    GENDER gender;

    public Seller(String firstName, String lastName, GENDER gender, LocalDate birthDate) {
        super(firstName, lastName, gender, birthDate);
    }
}
