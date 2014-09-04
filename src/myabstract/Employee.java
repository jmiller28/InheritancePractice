package myabstract;

public abstract class Employee {

    private String name;
    private int employeeNumber;
    private String jobTitle;

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getEmployeeNumber();

    public abstract String getJobTitle();

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
//could have the constructor here
}
