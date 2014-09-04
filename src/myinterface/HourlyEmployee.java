package myinterface;

import java.time.LocalDate;

public class HourlyEmployee implements Employee {

    private String lastName;
    private String firstName;
    private char middleInitial;
    private int employeeNumber;
    private LocalDate startDate;
    private double hourlyRate;

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
    public char getMiddleIntial() {
        return middleInitial;
    }

    @Override
    public void setMiddleIntial(char middleInitial) {
        //validation goes here
        this.middleInitial = middleInitial;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(LocalDate startDate) {
        //validation goes here
        this.startDate = startDate;
    }

}
