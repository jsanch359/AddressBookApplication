// AddressBook.java
package address;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
A class that initializes my list
@author Juan Sanchez
 @since 2023.3.4
 */
public class AddressBook {
    private List<AddressEntry> entries;

    /**
    Default Constructor for AddressBook
    @author Juan Sanchez
     @since 2023.3.4
     */
    public AddressBook() {
        this.entries = new ArrayList<>();
    }

    /**
    Adds in new entries to the list
    @author Juan Sanchez
    @param  entry the user input; either integers or string
     @since 2023.3.4
     */
    public void addEntry(AddressEntry entry) {
        entries.add(entry);
    }

    /**
    Removes any entries when given a last name
    @author Juan Sanchez
    @param  entry input, more specifically entries last name section
     @since 2023.3.4
     */
    public void removeEntry(String entry) {
        entries.remove(entry);
    }


    /**
    Searches for entries in the list based on the last name
    @author Juan Sanchez
    @param lastName file needs to open and the last name needs to be in the list
    @return Full list of entries
     @since 2023.3.4
     */
    public List<AddressEntry> findEntries(String lastName) {
        List<AddressEntry> foundEntries = new ArrayList<>();
        for (AddressEntry entry : entries) {
            if (entry.getLastName().startsWith(lastName)) {
                foundEntries.add(entry);
            }
        }
        return foundEntries;
    }

    /**
    Prints out the full list of entries based on the number of individuals in the list
    @author Juan Sanchez
     @since 2023.3.4
     */
    public void listEntries() {
        Collections.sort(entries, (entry1, entry2) -> entry1.getLastName().compareToIgnoreCase(entry2.getLastName()));
        for (AddressEntry entry : entries) {
            System.out.println("Name: " + entry.getFirstName() + " " + entry.getLastName());
            System.out.println("Street: " + entry.getStreet());
            System.out.println("City: " + entry.getCity());
            System.out.println("State: " + entry.getState());
            System.out.println("Zip: " + entry.getZip());
            System.out.println("Email: " + entry.getEmail());
            System.out.println("Phone: " + entry.getPhone());
            System.out.println();
        }
    }
}

