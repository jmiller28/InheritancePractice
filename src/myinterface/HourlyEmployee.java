package myinterface;
import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class HourlyEmployee implements Employee {

    private String lastName;
    private String firstName;
    private char middleInitial;
    private int employeeNumber;
    private Calendar startDate;
    private Calendar currentDate;
    private double hourlyRate;
    private int lengthOfService;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        //validation goes here
        this.hourlyRate = hourlyRate;
    }
    Calendar rightNow = Calendar.getInstance();
    
    @Override
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public void setEmployeeNumber(int employeeNumber) {
        //validation goes here
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        //validation goes here
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        //validation goes here
        this.lastName = lastName;
    }

    @Override
    public char getMiddleIntial() {
        return middleInitial;
    }

    @Override
    public void setMiddleIntial(char middleInitial) {
        //validation goes here
        this.middleInitial = middleInitial;
    }

    @Override
    public Calendar getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(Calendar startDate) {
        //validation goes here
        this.startDate = startDate;
    }

    @Override
    public long getLengthOfService() {
        //startDate = getStartDate();
        return rightNow.compareTo(getStartDate()) ;
    }

    void setstartDate(Calendar c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

}
