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
public class SalariedEmployee extends Employee{
    private boolean isExempt;
    private double annualSalary;
    private boolean bonusEligible;

    public boolean isIsExempt() {
        return isExempt;
    }

    public void setIsExempt(boolean isExempt) {
        this.isExempt = isExempt;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isBonusEligible() {
        return bonusEligible;
    }

    public void setBonusEligible(boolean bonusEligible) {
        this.bonusEligible = bonusEligible;
    }
    
    
    
}
