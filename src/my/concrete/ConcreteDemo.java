package my.concrete;

public class ConcreteDemo {

    public static void main(String[] args) {
        //Employee ee1 = new Employee("John", 1, "Boss");
        HourlyEmployee ee1 = new HourlyEmployee("John", 2, "Boss");
        SalariedEmployee ee2 = new SalariedEmployee("John", 3, "Boss");
        SalaryPlusCommissionEmployee ee3 = new SalaryPlusCommissionEmployee("John", 4, "Boss");
        ee1.setHourlyRate(55.00);
        ee2.setIsExempt(true);
        ee2.setAnnualSalary(80000.00);
        ee2.setIsBonusEligible(false);
        ee3.setIsExempt(true);
        ee3.setAnnualSalary(80000.00);
        ee3.setIsBonusEligible(false);
        ee3.setCommissionPercent(.1);
        System.out.println(ee1.getEmployeeNumber());
        System.out.println(ee1.getEmployeeNumber() + ": " + ee1.getHourlyRate());
        System.out.println(ee2.getEmployeeNumber() + ": " + ee2.getAnnualSalary());
        System.out.println(ee3.getEmployeeNumber() + ": " + ee3.getCommissionPercent());
    }

}
