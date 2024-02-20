// AddressBookApplication.java
package address;

import address.AddressBook;
import address.AddressEntry;

public class AddressBookApplication {

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);
    }

    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry entry1 = new AddressEntry("Aaron Yu", "1569 Mission St", "(800)-482-1234", "ay159@yahoo.com");
        AddressEntry entry2 = new AddressEntry("Alex Lopez", "55554 Turkey Blvd", "(555)-999-5678", "al321@gmail.com");

        ab.addAddressEntry(entry1);
        ab.addAddressEntry(entry2);

        ab.list();
    }
}
