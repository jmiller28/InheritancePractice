package myinterface;

import java.text.DecimalFormat;
import java.util.Calendar;

public abstract class InterfaceDemo implements Employee {

    public static void main(String[] args) {

        Calendar startDate = Calendar.getInstance();

        HourlyEmployee ee1 = new HourlyEmployee();
        startDate.set(1980, 0, 9);
        ee1.setFirstName("John");
        ee1.setLastName("Miller");
        ee1.setMiddleInitial('D');
        ee1.setStartDate(startDate);
        ee1.setEmployeeNumber(1);
        ee1.setHourlyRate(75.00);

        SalariedEmployee ee2 = new SalariedEmployee();
        startDate.set(1980, 0, 9);
        ee1.setHourlyRate(55.00);
        ee2.setFirstName("John");
        ee2.setLastName("Jones");
        ee2.setMiddleInitial('A');
        ee2.setStartDate(startDate);
        ee2.setEmployeeNumber(2);
        ee2.setIsExempt(true);
        ee2.setAnnualSalary(80000.00);
        ee2.setIsBonusEligible(false);

        SalaryPlusCommissionEmployee ee3 = new SalaryPlusCommissionEmployee();
        startDate.set(1980, 0, 9);
        ee3.setFirstName("John");
        ee3.setLastName("Smaith");
        ee3.setMiddleInitial('C');
        ee3.setStartDate(startDate);
        ee3.setEmployeeNumber(3);
        ee3.setIsExempt(true);
        ee3.setAnnualSalary(80000.00);
        ee3.setIsBonusEligible(false);
        ee3.setCommissionPercent(.1);

        DecimalFormat df0 = new DecimalFormat("#");
        System.out.println("Employee: " + ee1.getFirstName() + " " + ee1.getMiddleInitial() + ". " + ee1.getLastName() + " has accrued " + df0.format(ee1.getYearsOfService()) + " years of service based on their employee classification.");
        System.out.println("Employee: " + ee1.getFirstName() + " " + ee2.getMiddleInitial() + ". " + ee2.getLastName() + " has accrued " + df0.format(ee2.getYearsOfService()) + " years of service based on their employee classification.");

        DecimalFormat df1 = new DecimalFormat("#.#");
        System.out.println("Employee: " + ee3.getFirstName() + " " + ee3.getMiddleInitial() + ". " + ee3.getLastName() + " has accrued " + df1.format(ee3.getYearsOfService()) + " years of service based on their employee classification.");
    }

}
