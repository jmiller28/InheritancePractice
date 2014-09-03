package myinterface;

public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    private double commissionPercent;

    //public SalaryPlusCommissionEmployee(boolean isExempt, double annualSalary, boolean isBonusEligible) {
    //    super(isExempt, annualSalary, isBonusEligible);
    //}
    
    public void SalaryPlusCommissionEmployee(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

}
