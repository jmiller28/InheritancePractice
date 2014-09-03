package myabstract;

public abstract class AbstractDemo extends Employee{

    public static void main(String[] args) {
        HourlyEmployee ee1 = new HourlyEmployee();
        ee1.setName("John");
        ee1.setJobTitle("Boss");
        ee1.setEmployeeNumber(1);
        ee1.setHourlyRate(75.00);
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

    @Override
   public abstract String getName();

    @Override
    public abstract int getEmployeeNumber();

    @Override
    public abstract String getJobTitle();

    

}
