package myabstract;

import java.util.Calendar;

public abstract class Employee {

    private String lastName;
    private String firstName;
    private char middleInitial;
    private int employeeNumber;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        //validation goes here
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //validation goes here
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //validation goes here
        this.firstName = firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        //validation goes here
        this.middleInitial = middleInitial;
    }

    public abstract Calendar getStartDate();

    public abstract void setStartDate(Calendar startDate);

    public abstract double getYearsOfService();

}
