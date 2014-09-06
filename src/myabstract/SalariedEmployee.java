package myabstract;

public class SalariedEmployee extends Employee {

    private boolean isExempt;
    private double annualSalary;
    private boolean isBonusEligible;

    public SalariedEmployee(String name, int employeeNumber, String jobTitle) {
        //super(name, employeeNumber, jobTitle);
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

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEmployeeNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJobTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
