import java.time.LocalDateTime;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2020-09-30 <br>
 * Time: 10:51 <br>
 * Project: Bank <br>
 */
public class Bankomaten {
    public static void main(String[] args) {
        Client client1 = new Client("Arne","Johansson","550926-6217","Testgatan 17, 12345 Sthlm");
        Employee employee1 = new Employee("Susan","Andersson","751224-2544","Bråvallagatan 6, 19876 Sthml");

        Account account1 = new Account(client1,"Sparkonto",1000,0.0085,employee1);
        client1.getAccounts().add(account1);
        Loan loan1 = new Loan(client1,"Bolån",2000000,0.02,employee1);
        client1.getLoans().add(loan1);

        client1.getAccounts().get(0).changeInterest(employee1,0.019);
        System.out.println(client1.getAccounts().get(0).getInterest());
        System.out.println(client1.getAccounts().get(0).getListOfInterestChanges().get(0).getEmployeeofChange().getFirstName());

    }
}
