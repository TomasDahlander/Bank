/**
 * Created by Tomas Dahlander <br>
 * Date: 2020-09-30 <br>
 * Time: 09:30 <br>
 * Project: Bank <br>
 */
public class Person {
    private String firstName;
    private String lastName;
    private String personNr;
    private String address;

    // Konstruktor
    public Person(String firstName,String lastName, String personNr, String address){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPersonNr(personNr);
        this.setAddress(address);
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if(firstName != null && !firstName.equals("")) this.firstName = firstName;
        else throw new IllegalArgumentException("Förnamn kan ej vara blankt/tomt.");
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if(lastName != null && !lastName.equals("")) this.lastName = lastName;
        else throw new IllegalArgumentException("Efternamn kan ej vara blankt/tomt.");
    }
    public String getPersonNr() {
        return personNr;
    }
    public void setPersonNr(String personNr) {
        if(personNr != null && !personNr.equals("")) this.personNr = personNr;
        else throw new IllegalArgumentException("Personnummer kan ej vara blankt.");
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if(address != null && !address.equals("")) this.address = address;
        else throw new IllegalArgumentException("Adress kan ej vara blankt/tomt.");
    }
}
