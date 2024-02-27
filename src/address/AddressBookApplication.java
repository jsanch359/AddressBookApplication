// AddressBookApplication.java
package address;


/**
    Initializes the Address Book and starts the menu display
    @author Juan Sanchez
     */
public class AddressBookApplication {
    private static final AddressBook addressBook = new AddressBook();

    /**
    Starts the menu display
    @author Juan Sanchez
    @param arguments String command line
     @since 2023.3.4
     */
    public static void main(String[] arguments){
        Menu menu = new Menu(addressBook);
        menu.displayMenu();
    }
}
