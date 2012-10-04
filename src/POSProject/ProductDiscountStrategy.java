/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSProject;

/**
 *
 * @author kguzikowski
 */
public class ProductDiscountStrategy implements DiscountStrategy {



    private double discountPercent = .5;

    public final void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }


    @Override
    public double calculateDiscount(double cost, int qty) {
        if (discountPercent > 1) {
            throw new IllegalArgumentException();
        }
        return (cost * discountPercent);


    }
}
