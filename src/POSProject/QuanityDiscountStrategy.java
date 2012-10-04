/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSProject;

/**
 *
 * @author kguzikowski
 */
public class QuanityDiscountStrategy  implements DiscountStrategy{

      private int minQty = 5;
    private double discountPercent = .5;



    @Override
    public double calculateDiscount(double cost, int qty) {
        if (qty > minQty) {
            return (cost * discountPercent);
        } else {
            return 0;

    }

}
}