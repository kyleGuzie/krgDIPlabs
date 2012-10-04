/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.POSProject;

/**
 *
 * 10-3-2012 3:02PM
 * class description
 *
 * @author Kyle Guzikowski
 * @version 1.2
 */
public class PercentageDiscount implements ProductDiscountStrategy {

    private double discountPercent = .30;

    public void setDiscountPercent(double discountPercent) {
        if (discountPercent >= 1) {
            throw new IllegalArgumentException();
        }
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateDiscount(double cost, double qty) {
        return (cost * discountPercent);
    }
}
