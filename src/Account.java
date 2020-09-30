import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2020-09-30 <br>
 * Time: 09:32 <br>
 * Project: Bank <br>
 */
public class Account {
    private String accountName;
    private double interest = 0.0085;
    private double balance = 0;
    private Client accountOwner;
    private Employee accountManager;
    private List<InterestChange> listOfInterestChanges = new ArrayList<>();

    // Konstruktor
    public Account(Client accountOwner, String accountName){
        this.setAccountOwner(accountOwner);
        this.setAccountName(accountName);
    }
    public Account(Client accountOwner,String accountName,double balance){
        this.setAccountOwner(accountOwner);
        this.setAccountName(accountName);
        this.setBalance(balance);
    }
    public Account(Client accountOwner, String accountName,double balance,double interest, Employee accountManager){
        this.setAccountOwner(accountOwner);
        this.setAccountName(accountName);
        this.setBalance(balance);
        this.setInterest(interest);
        this.setAccountManager(accountManager);
    }

    // Setters and getters
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        if(accountName != null && !accountName.equals("")) this.accountName = accountName;
        else throw new IllegalArgumentException();
    }
    public double getBalance() {
        return balance;
    }
    private void setBalance(double balance) {
        if(balance>=0) this.balance = balance;
        else throw new IllegalArgumentException("Kan ej ha mindre än 0 på kontot.");
    }
    public double getInterest() {
        return interest;
    }
    private void setInterest(double interest) {
        if(interest>=0) this.interest = interest;
        else throw new IllegalArgumentException("Kan ej vara mindre än 0.");
    }
    public Client getAccountOwner() {
        return accountOwner;
    }
    public void setAccountOwner(Client accountOwner) {
        if(accountOwner != null) this.accountOwner = accountOwner;
        else throw new IllegalArgumentException("En kund måste anges.");
    }
    public Employee getAccountManager() {
        return accountManager;
    }
    public void setAccountManager(Employee accountManager) {
        if(accountManager != null) this.accountManager = accountManager;
        else throw new IllegalArgumentException("En anställd måste anges.");
    }

    public List<InterestChange> getListOfInterestChanges() {
        return listOfInterestChanges;
    }

    // Metod för insättning
    public void deposit(double deposit){
        this.balance += deposit;
    }

    // Metod för uttag
    public void withdraw(double withdraw){
        double newBalance = this.balance-withdraw;
        if(newBalance>=0) this.balance = newBalance;
        else System.out.println("Finns inte tillräcklig täckning på kontot.");
    }

    // Metod för att registrera en ränteändring
    public void changeInterest(Employee employee, double interest){
        listOfInterestChanges.add(new InterestChange(employee,interest));
        this.setInterest(interest);
    }

}
