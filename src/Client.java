import java.util.*;
/**
 * Created by Tomas Dahlander <br>
 * Date: 2020-09-30 <br>
 * Time: 09:31 <br>
 * Project: Bank <br>
 */
public class Client extends Person {
    private List<Account> accounts = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public Client(String firstName,String lastName, String personNr, String address){
        super(firstName,lastName,personNr,address);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Account> accounts) {
        if(accounts != null) this.accounts = accounts;
        else throw new IllegalArgumentException();
    }
    public List<Loan> getLoans() {
        return loans;
    }
    public void setLoans(List<Loan> loans) {
        if(loans != null) this.loans = loans;
        else throw new IllegalArgumentException();
    }
}
