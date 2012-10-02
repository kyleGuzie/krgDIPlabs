/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSProject;

/**
 *
 * @author kguzikowski
 */
public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price, int qty) {
       return 0;
    }
    
}
