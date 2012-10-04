/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSProject;

/**
 *
 * @author bossMan
 */
 public interface  DiscountCalcService {
     DiscountStrategy discountStrategy = new DiscountStrategy() {

         @Override
         public double calculateDiscount(double price, int qty) {
             throw new UnsupportedOperationException("Not supported yet.");
         }
     };


}
