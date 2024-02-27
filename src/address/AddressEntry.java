// AddressEntry.java
package address;

/**
  Initializes Address Entry
  @author Juan Sanchez
  @since 2023.3.4
   */
public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String email;
    private String phone;

    /**
    This is a default Constructor to set up the private variables
    @author Juan Sanchez
    @since 2023.3.4
     */
    public AddressEntry() {
        this("", "", "", "", "", 0, "", "");
    }

    /**
    This method initializes the private variables with their respected user input
    @author Juan Sanchez
    @param zip,lastName,firstName,street,city,state,email,phone input that follows the String and Int data type
    @since 2023.3.4
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
    }

    /**
    Retrieves the first name
    @author Juan Sanchez
     @return first name
    @since 2023.3.4
     */
    public String getFirstName() {
        return firstName;
    }
    /**
    Sets the first name
    @author Juan Sanchez
    @param firstName name is a string
    @since 2023.3.4
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
    Retrieves the last name
    @author Juan Sanchez
     @return Last name is returned
    @since 2023.3.4
     */
    public String getLastName() {
        return lastName;
    }

    /**
    Sets the last name
  @author Juan Sanchez
  @param lastName name is a string
  @since 2023.3.4
   */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
    Retrieves the street address
  @author Juan Sanchez
  @return the street address is returned
  @since 2023.3.4
   */
    public String getStreet() {
        return street;
    }


    /**
    Sets the street address
      @author Juan Sanchez
      @param street address needs to be a string
      @since 2023.3.4
       */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
    Retrieves the city name
  @author Juan Sanchez
     @return returns the city name
  @since 2023.3.4
   */
    public String getCity() {
        return city;
    }

    /**
    Sets the city name
  @author Juan Sanchez
  @param city name should be a string type
  @since 2023.3.4
   */
    public void setCity(String city) {
        this.city = city;
    }

    /**
    retrieves the state name
  @author Juan Sanchez
  @return The state name is returned
  @since 2023.3.4
   */
    public String getState() {
        return state;
    }

    /**
    sets the state name
  @author Juan Sanchez
  @param state name needs to be a string
  @since 2023.3.4
   */
    public void setState(String state) {
        this.state = state;
    }

    /**
    retrieves the zip address
  @author Juan Sanchez
  @return zip address is returned
  @since 2023.3.4
   */
    public int getZip() {
        return zip;
    }

    /**
    sets the zip address
  @author Juan Sanchez
  @param zip address needs to be an int
  @since 2023.3.4
   */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
    retrieves the email from user
  @author Juan Sanchez
  @return The email is returned
  @since 2023.3.4
   */
    public String getEmail() {
        return email;
    }

    /**
    sets the email address
  @author Juan Sacnchez
  @param email the email address is a string
  @since 2023.3.4
   */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
    retrieves the phone number
  @author Juan Sanchez
  @return the phone number is returned
  @since 2023.3.4
   */
    public String getPhone() {
        return phone;
    }

    /**
    sets the phone number
  @author Juan Sanchez
  @param phone number is a string
  @since 2023.3.4
   */
    public void setPhone(String phone) {
        this.phone = phone;
    }



    /**
    This method makes the information and makes it into a string
  @author Juan Sanchez
  @return User information has been formatted to be printed
  @since 2023.3.4
   */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Address: " + street + ", " + city + ", " + state + " " + zip + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone;
    }
}
