package myinterface;

import java.util.Calendar;

public class SalariedEmployee implements Employee {

    private String lastName;
    private String firstName;
    private char middleInitial;
    private int employeeNumber;
    private Calendar startDate;
    Calendar currentDate = Calendar.getInstance();

    private boolean isExempt;
    private double annualSalary;
    private boolean isBonusEligible;

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

    public boolean isIsExempt() {
        return isExempt;
    }

    public void setIsExempt(boolean isExempt) {
        //validation goes here
        this.isExempt = isExempt;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        //validation goes here
        this.annualSalary = annualSalary;
    }

    public boolean isBonusEligible() {
        return isBonusEligible;
    }

    public void setIsBonusEligible(boolean isBonusEligible) {
        //validation goes here
        this.isBonusEligible = isBonusEligible;
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
        yearsOfService = Math.ceil(yearsOfService);
        return yearsOfService;
    }

}
