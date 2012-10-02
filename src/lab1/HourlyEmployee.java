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
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalAnnualHours;
    private static double maxRate = 50;
    private final static double MAX_HOURS = 8760;

    public HourlyEmployee(double hourlyRate, double totalAnnualHours) {
       setHourlyRate(hourlyRate);
       setTotalAnnualHours(totalAnnualHours);

    }




    public final double getHourlyRate() {
        return hourlyRate;
    }


    public final void setHourlyRate(double hourlyRate) {
        //needs validation
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalAnnualHours() {
        return totalAnnualHours;
    }


    public final void setTotalAnnualHours(double totalAnnualHours) {
        //needs validation
        this.totalAnnualHours = totalAnnualHours;
    }


    public static double getMaxRate() {
        return maxRate;
    }


    public static void setMaxRate(double maxRate) {
        HourlyEmployee.maxRate = maxRate;
    }


    public static double getMAX_HOURS() {
        return MAX_HOURS;
    }

    @Override
    public double calculateAnnualWages() {
        return hourlyRate - totalAnnualHours;
    }
}
