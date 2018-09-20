package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1985, Month.AUGUST, 24);
        Person person = new Person ("Luis", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }    
}
