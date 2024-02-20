// AddressEntry.java
package address;

public class AddressEntry {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public AddressEntry(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter methods

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // toString method

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\n";
    }
}
