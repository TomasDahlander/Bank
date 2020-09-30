/**
 * Created by Tomas Dahlander <br>
 * Date: 2020-09-30 <br>
 * Time: 09:31 <br>
 * Project: Bank <br>
 */
public class Employee extends Person {
    private int salory;

    public Employee(String firstName,String lastName, String personNr, String address){
        super(firstName,lastName,personNr,address);
    }

    // Getters and setters
    public int getSalory() {
        return salory;
    }
    public void setSalory(int salory) {
        if(salory>0) this.salory = salory;
        else throw new IllegalArgumentException();
    }
}
