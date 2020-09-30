import java.time.LocalDateTime;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2020-09-30 <br>
 * Time: 14:26 <br>
 * Project: Bank <br>
 */
public class InterestChange {
    private String date;
    private double interest;
    private Employee employee;


    // Konstruktor
    public InterestChange(Employee employee, double interest){
        String year = LocalDateTime.now().getYear()+"";
        String month = String.format("%02d",LocalDateTime.now().getMonthValue());
        String day = String.format("%02d",LocalDateTime.now().getDayOfMonth());
        String date = year+"-"+month+"-"+day;

        this.date = date;
        this.employee = employee;
        this.interest = interest;
    }

    // Getters
    public String getDateOfChange() {
        return date;
    }
    public double getInterestOfChange() {
        return interest;
    }
    public Employee getEmployeeofChange() {
        return employee;
    }
}
