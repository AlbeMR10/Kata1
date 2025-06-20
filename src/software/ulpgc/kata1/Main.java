package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alberto", LocalDate.of(2000, 10, 25));
        System.out.println(person);
    }
}
