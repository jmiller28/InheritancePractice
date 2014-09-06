package myabstract;

import java.util.Calendar;

public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    private double commissionPercent;
    private Calendar startDate;
    private Calendar currentDate = Calendar.getInstance();

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
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
        return yearsOfService;
    }
}
