package myinterface;

import java.util.Calendar;

public class HourlyEmployee implements Employee {

    private String lastName;
    private String firstName;
    private char middleInitial;
    private int employeeNumber;
    private double hourlyRate;
    private Calendar startDate;
    private Calendar currentDate = Calendar.getInstance();

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        //validation goes here
        this.hourlyRate = hourlyRate;
    }

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
    public char getMiddleInitial() {
        return middleInitial;
    }

    @Override
    public void setMiddleInitial(char middleInitial) {
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
    public double getYearsOfService() {
        long milsecs1 = startDate.getTimeInMillis();
        long milsecs2 = currentDate.getTimeInMillis();
        long diff = milsecs2 - milsecs1;
        long ddays = diff / (24 * 60 * 60 * 1000);
        double yearsOfService = ddays / 365.0;
        yearsOfService = Math.floor(yearsOfService);
        return yearsOfService;
    }

}
