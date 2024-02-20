// AddressBook.java
package address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook {
    private List<AddressEntry> addressEntryList;

    public AddressBook() {
        addressEntryList = new ArrayList<>();
    }

    public void addAddressEntry(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }

    public void list() {
        Iterator<AddressEntry> iterator = addressEntryList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}

