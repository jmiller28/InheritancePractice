package my.concrete;

public class Employee {

    private String name;
    private int employeeNumber;
    private String jobTitle;

    public Employee(String name, int employeeNumber, String jobTitle) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
