import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

public class JFairyTestDataGenerator {
    public static void main(String[] args) {
        Fairy fairy=Fairy.create();
        Person person=fairy.person();
        String firstName= person.getFirstName();
        String lastName= person.getLastName();
        String address= person.getAddress().getAddressLine1();
        String email= person.getEmail();
        String phoneNumber= person.getTelephoneNumber();
        String passportNumber=person.getPassportNumber();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(passportNumber);

    }
}
