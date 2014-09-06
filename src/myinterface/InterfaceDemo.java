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
        ee1.setMiddleIntial('D');
        ee1.setStartDate(startDate);
        ee1.setEmployeeNumber(1);
        ee1.setHourlyRate(75.00);

        SalariedEmployee ee2 = new SalariedEmployee();
        startDate.set(1980, 0, 9);
        ee1.setHourlyRate(55.00);
        ee2.setFirstName("John");
        ee2.setStartDate(startDate);
        ee2.setEmployeeNumber(2);
        ee2.setIsExempt(true);
        ee2.setAnnualSalary(80000.00);
        ee2.setIsBonusEligible(false);

        SalaryPlusCommissionEmployee ee3 = new SalaryPlusCommissionEmployee();
        startDate.set(1980, 0, 9);
        ee3.setFirstName("John");
        ee3.setStartDate(startDate);
        ee3.setEmployeeNumber(3);
        ee3.setIsExempt(true);
        ee3.setAnnualSalary(80000.00);
        ee3.setIsBonusEligible(false);
        ee3.setCommissionPercent(.1);

        DecimalFormat df0 = new DecimalFormat("#");
        System.out.println(ee1.getEmployeeNumber() + ": " + df0.format(ee1.getYearsOfService()));
        System.out.println(ee2.getEmployeeNumber() + ": " + df0.format(ee2.getYearsOfService()));

        DecimalFormat df1 = new DecimalFormat("#.#");
        System.out.println(ee3.getEmployeeNumber() + ": " + df1.format(ee3.getYearsOfService()));
    }

}
