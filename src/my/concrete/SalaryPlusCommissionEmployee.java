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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
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
