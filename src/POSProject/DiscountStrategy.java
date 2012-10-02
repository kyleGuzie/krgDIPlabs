/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSProject;

/**
 *
 * In-class POS sale system
 * 10-2-12
 * 
 * @author Kyle Guzikowski
 * @version 1.00
 */
interface DiscountStrategy {
    public abstract double calculateDiscount(double price, int qty);
    
}
