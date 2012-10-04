/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.POSProject;

/**
 * 10-3-2012 3:02PM
 * class description
 *
 * @author Kyle Guzikowski
 * @version 1.2 
 *
 */
public interface ProductDiscountStrategy {

    /**
     *
     * @param cost
     * @param qty
     * @return the discount amount
     */
    abstract double calculateDiscount(double cost, double qty);
}
