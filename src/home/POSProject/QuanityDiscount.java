/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.POSProject;

/**
 *
 *
 *  10-3-2012 3:02PM
 * class description
 *
 * @author Kyle Guzikowski
 * @version 1.2
 */
public class QuanityDiscount implements ProductDiscountStrategy {

    private double discountPercent = .5;
    private double minQuanity = 4;

    public final void setMinQuanity(int minQuanity) {
        this.minQuanity = minQuanity;
    }

    public final void setDiscountPercent(double discountPercent) {
        if (discountPercent >= 1) {
            throw new IllegalArgumentException();
        }
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateDiscount(double cost, double qty) {
        if (qty >= minQuanity) {
            return (cost * discountPercent) * qty;
        } else {
            return 0;
        }

    }
}
