package myinterface;

public abstract class InterfaceDemo implements Employee {

    public static void main(String[] args) {
        HourlyEmployee ee1 = new HourlyEmployee();
        ee1.setName("John");
        ee1.setJobTitle("Boss");
        ee1.setEmployeeNumber(1);
        ee1.setHourlyRate(75.00);
        SalariedEmployee ee2 = new SalariedEmployee();
        SalaryPlusCommissionEmployee ee3 = new SalaryPlusCommissionEmployee();
        ee1.setHourlyRate(55.00);
        ee2.setName("John");
        ee2.setJobTitle("Boss");
        ee2.setEmployeeNumber(2);
        ee2.setIsExempt(true);
        ee2.setAnnualSalary(80000.00);
        ee2.setIsBonusEligible(false);
        ee3.setName("John");
        ee3.setJobTitle("Boss");
        ee3.setEmployeeNumber(3);
        ee3.setIsExempt(true);
        ee3.setAnnualSalary(80000.00);
        ee3.setIsBonusEligible(false);
        ee3.setCommissionPercent(.1);
        System.out.println(ee1.getEmployeeNumber() + ": " + ee1.getHourlyRate());
        System.out.println(ee2.getEmployeeNumber() + ": " + ee2.getAnnualSalary());
        System.out.println(ee3.getEmployeeNumber() + ": " + ee3.getCommissionPercent());
    }

}
