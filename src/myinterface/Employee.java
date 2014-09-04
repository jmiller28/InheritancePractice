package myinterface;

import java.time.LocalDate;

public interface Employee {

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    public abstract char getMiddleIntial();

    public abstract void setMiddleIntial(char middleInitial);

    public abstract int getEmployeeNumber();

    public abstract void setEmployeeNumber(int employeeNumber);

    public abstract LocalDate getStartDate();

    public abstract void setStartDate(LocalDate startDate);

}
