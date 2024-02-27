// Menu.java
package address;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
Initializes the class Menu in order to create entries
  @author Juan Sanchez
  @since 2023.3.4
   */
public class Menu {
    private AddressBook addressBook;
    private Scanner scanner;

    /**
  Initialize addressBook
  @author Juan Sanchez
     @since 2023.3.4
   */
    public Menu(AddressBook addressBook) {
        this.addressBook = addressBook;
        this.scanner = new Scanner(System.in);
    }

    /**
    //Displays the interface for the Address Book
 @author Juan Sanchez
 @since 2023.3.4
  */
    public void displayMenu() {
        char choice;
        do {
            System.out.println("Menu Options:");
            System.out.println("a) Loading of entries from a file.");
            System.out.println("b) Addition");
            System.out.println("c) Removal");
            System.out.println("d) Find");
            System.out.println("e) Listing");
            System.out.println("f) Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline character

            //Switch Case to direct what the user wants to do
            switch (choice) {
                case 'a':
                    // Load entries from file
                    System.out.print("Enter File Name: ");
                    String fileName = scanner.nextLine();
                    loadEntriesFromFile(fileName);
                    break;
                case 'b':
                    addEntry();
                    break;
                case 'c':
                    removeEntry();
                    break;
                case 'd':
                    findEntry();
                    break;
                case 'e':
                    listEntries();
                    break;
                case 'f':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'f');
    }

    /**
    The addEntry method takes in the user information and adds it to the list
 @author Juan Sanchez
 @since 2023.3.4
  */
    private void addEntry() {
        System.out.println("Adding a new entry:");

        AddressEntry newEntry = new AddressEntry();

        // Prompt user for information
        System.out.print("First Name: ");
        newEntry.setFirstName(scanner.nextLine());

        System.out.print("Last Name: ");
        newEntry.setLastName(scanner.nextLine());

        System.out.print("Street: ");
        newEntry.setStreet(scanner.nextLine());

        System.out.print("City: ");
        newEntry.setCity(scanner.nextLine());

        System.out.print("State: ");
        newEntry.setState(scanner.nextLine());

        int zip = 0;
        boolean validZip = false;
        while (!validZip) {
            try {
                System.out.print("Zip: ");
                zip = Integer.parseInt(scanner.nextLine());
                validZip = true; // If parsing succeeds, set validZip to true
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for the Zip code.");
            }
        }
        newEntry.setZip(zip);

        System.out.print("Email: ");
        newEntry.setEmail(scanner.nextLine());

        int phone = 0;
        boolean validPhone = false;
        while(!validPhone){
            try{
                System.out.print("Phone: ");
                phone = Integer.parseInt(scanner.nextLine());
                validPhone = true; // If parsing succeeds, set validZip to true
            } catch(NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for the Phone number");
            }
        }
        newEntry.setPhone(String.valueOf(phone));

        addressBook.addEntry(newEntry);
        System.out.println("New entry added successfully!");
    }

    /**
    Removes an entry from the list based on the last name
 @author Juan Sanchez
 @since 2023.3.4
  */
    private void removeEntry() {
        System.out.println("Removing an entry:");
        // Implement removal of an entry
        System.out.print("Enter the last name of the entry you want to remove: ");
        String lastName = scanner.nextLine();
        addressBook.removeEntry(lastName);
    }

    /**
    Searches the list based on last name
 @author Juan Sanchez
 @since 2023.3.4
  */
    private void findEntry() {
        System.out.println("Finding an entry:");
        // Implement searching for an entry
        System.out.print("Enter the beginning of the last name: ");
        String prefix = scanner.nextLine();
        addressBook.findEntries(prefix);
    }

    /**
    This method calls listEntries to print the list of entries
 @author Juan Sanchez
 @since 2023.3.4
  */
    private void listEntries() {
        System.out.println("Listing entries:");
        // Implement listing of entries
        addressBook.listEntries();
    }

    /**
    This method takes in the file and reads it
 @author Juan Sanchez
 @param fileName A file that opens
 @since 2023.3.4
  */
    private void loadEntriesFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            String firstName = "";
            String lastName = "";
            String street = "";
            String city = "";
            String state = "";
            int zip = 0;
            String email = "";
            String phone = "";

            while (fileScanner.hasNextLine()) {
                firstName = fileScanner.nextLine().trim();
                lastName = fileScanner.nextLine().trim();
                street = fileScanner.nextLine().trim();
                city = fileScanner.nextLine().trim();
                state = fileScanner.nextLine().trim();
                zip = Integer.parseInt(fileScanner.nextLine().trim());
                email = fileScanner.nextLine().trim();
                phone = fileScanner.nextLine().trim();

                // Create AddressEntry object and add it to the AddressBook
                AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zip, email, phone);
                addressBook.addEntry(entry);
            }
            System.out.println("Entries loaded successfully from file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (NumberFormatException e) {
            System.out.println("Invalid zip code format in file.");
        }
    }
}
