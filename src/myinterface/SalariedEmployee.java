package myinterface;

public class SalariedEmployee extends InterfaceDemo {

    private boolean isExempt;
    private double annualSalary;
    private boolean isBonusEligible;

    public SalariedEmployee(boolean isExempt, double annualSalary, boolean isBonusEligible) {
        this.isExempt = isExempt;
        this.annualSalary = annualSalary;
        this.isBonusEligible = isBonusEligible;
    }

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

}
