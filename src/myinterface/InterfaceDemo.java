package myinterface;

public class InterfaceDemo {

    public static void main(String[] args) {
        Employee ee1 = new Employee("John", 1, "Boss");
        HourlyEmployee ee2 = new HourlyEmployee("John", 2, "Boss");
        SalariedEmployee ee3 = new SalariedEmployee("John", 3, "Boss");
        SalaryPlusCommissionEmployee ee4 = new SalaryPlusCommissionEmployee("John", 4, "Boss");
        ee2.setHourlyRate(55.00);
        ee3.setIsExempt(true);
        ee3.setAnnualSalary(80000.00);
        ee3.setIsBonusEligible(false);
        ee4.setIsExempt(true);
        ee4.setAnnualSalary(80000.00);
        ee4.setIsBonusEligible(false);
        ee4.setCommissionPercent(.1);
        System.out.println(ee1.getEmployeeNumber());
        System.out.println(ee2.getEmployeeNumber() + ": " + ee2.getHourlyRate());
        System.out.println(ee3.getEmployeeNumber() + ": " + ee3.getAnnualSalary());
        System.out.println(ee4.getEmployeeNumber() + ": " + ee4.getCommissionPercent());
    }

}
