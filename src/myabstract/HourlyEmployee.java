package myabstract;

public class HourlyEmployee extends Employee {

    private double hourlyRate;

    public HourlyEmployee(String name, int employeeNumber, String jobTitle) {
        super(name, employeeNumber, jobTitle);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
