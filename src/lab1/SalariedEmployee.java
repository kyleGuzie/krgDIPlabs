/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @Kyle Guzikowski
 * @version 1.00 9/30/12
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;
    private static double maxBonus = 5000;
    private static double maxSalary = 125000;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualBonus(annualBonus);
        setAnnualSalary(annualSalary);
    }


    public static void setMaxBonus(double maxBonus) {
        SalariedEmployee.maxBonus = maxBonus;
    }


    public static void setMaxSalary(double maxSalary) {
        SalariedEmployee.maxSalary = maxSalary;
    }




    public static double getMaxBonus() {
        return maxBonus;
    }


    public static double getMaxSalary() {
        return maxSalary;
    }


    public final double getAnnualSalary() {
        return annualSalary;
    }


    public final double getAnnualBonus() {
        return annualBonus;
    }


    public final void setAnnualSalary(double annualSalary) {
        //validation needed
        this.annualSalary = annualSalary;
    }


    /**
     *
     * @param annualBonus
     */
    public final void setAnnualBonus(double annualBonus) {
        //validation needed
        this.annualBonus = annualBonus;
    }

    @Override
    public double calculateAnnualWages() {
        return annualSalary + annualBonus;
    }

}
