import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2020-09-30 <br>
 * Time: 09:32 <br>
 * Project: Bank <br>
 */
public class Loan {
    private String loanName;
    private double amount;
    private double interest;
    private Client loanOwner;
    private Employee loanManager;
    private List<InterestChange> listOfInterestChanges = new ArrayList<>();

    public Loan(Client loanOwner,String loanName, double amount,double interest, Employee loanManager){
        this.setLoanOwner(loanOwner);
        this.setLoanName(loanName);
        this.setAmount(amount);
        this.setInterest(interest);
        this.setLoanManager(loanManager);
    }

    // Getters and setters
    public String getLoanName() {
        return loanName;
    }
    public void setLoanName(String loanName) {
        if(loanName != null && !loanName.equals("")) this.loanName = loanName;
        else throw new IllegalArgumentException("Kan inte vara tomt.");
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        if(amount>=5000) this.amount = amount;
        else throw new IllegalArgumentException("Banken medger ej lån under 5.000 kr.");
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        if(interest>0) this.interest = interest;
        else throw new IllegalArgumentException("Räntan kan inte vara mindre eller lika med 0.");
    }
    public Client getLoanOwner() {
        return loanOwner;
    }
    public void setLoanOwner(Client loanOwner) {
        if(loanOwner != null) this.loanOwner = loanOwner;
        else throw new IllegalArgumentException("Kan inte vara null.");
    }
    public Employee getLoanManager() {
        return loanManager;
    }
    public void setLoanManager(Employee loanManager) {
        if(loanManager != null) this.loanManager = loanManager;
        else throw new IllegalArgumentException("Kan inte vara null.");
    }

    // Metod för att göra en betalning
    public void makeInstallment(double sum){
        this.amount -= sum;
    }

    // Metod för att få fram månadsräntan
    public int calculateMonthtlyInterest(){
        return (int)Math.round(this.amount * this.interest / 12);
    }

    // Metod för att registrera en ränteändring
    public void changeInterest(Employee employee, double interest){
        listOfInterestChanges.add(new InterestChange(employee,interest));
        this.setInterest(interest);
    }
}
