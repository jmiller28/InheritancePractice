package myinterface;

public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    private double commissionPercent;

    public SalaryPlusCommissionEmployee(String name, int employeeNumber, String jobTitle) {
        super(name, employeeNumber, jobTitle);
    }

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

}
