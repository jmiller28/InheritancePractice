package myinterface;

import java.util.Calendar;

public interface Employee {

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    public abstract char getMiddleIntial();

    public abstract void setMiddleIntial(char middleInitial);

    public abstract int getEmployeeNumber();

    public abstract void setEmployeeNumber(int employeeNumber);

    public abstract Calendar getStartDate();

    public abstract void setStartDate(Calendar startDate);

    public abstract double getYearsOfService();

}
