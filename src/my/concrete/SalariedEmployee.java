package my.concrete;

import java.util.Calendar;

public class SalariedEmployee extends Employee {

    private boolean isExempt;
    private double annualSalary;
    private boolean isBonusEligible;
    private Calendar startDate;
    private Calendar currentDate = Calendar.getInstance();

    public boolean isIsExempt() {
        return isExempt;
    }

    public void setIsExempt(boolean isExempt) {
        this.isExempt = isExempt;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isBonusEligible() {
        return isBonusEligible;
    }

    public void setIsBonusEligible(boolean isBonusEligible) {
        this.isBonusEligible = isBonusEligible;
    }

    public Calendar getStartDate() {
        return startDate;
    }

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
