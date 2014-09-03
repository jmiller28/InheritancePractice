/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.concrete;

/**
 *
 * @author jmiller
 */
public class Employee {

    private String name;
    private int employeeNumber;
    private String jobTitle;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Employee(String name, int employeeNumber, String jobTitle) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
    }

}
