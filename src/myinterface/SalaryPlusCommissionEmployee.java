package myinterface;

public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    private double commissionPercent;

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        //validation goes here
        this.commissionPercent = commissionPercent;
    }

}
