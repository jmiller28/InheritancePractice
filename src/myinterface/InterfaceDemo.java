package myinterface;

public class InterfaceDemo implements Employee {

    private String name;
    private int employeeNumber;
    private String jobTitle;

    public void Employee(String name, int employeeNumber, String jobTitle) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public static void main(String[] args) {
        HourlyEmployee ee1 = new HourlyEmployee("John", 1, "Boss");
        SalariedEmployee ee2 = new SalariedEmployee("John", 2, "Boss");
        SalaryPlusCommissionEmployee ee3 = new SalaryPlusCommissionEmployee("John", 3, "Boss");
        ee1.setHourlyRate(55.00);
        ee2.setIsExempt(true);
        ee2.setAnnualSalary(80000.00);
        ee2.setIsBonusEligible(false);
        ee3.setIsExempt(true);
        ee3.setAnnualSalary(80000.00);
        ee3.setIsBonusEligible(false);
        ee3.setCommissionPercent(.1);
        System.out.println(ee1.getEmployeeNumber() + ": " + ee1.getHourlyRate());
        System.out.println(ee2.getEmployeeNumber() + ": " + ee2.getAnnualSalary());
        System.out.println(ee3.getEmployeeNumber() + ": " + ee3.getCommissionPercent());
    }

}