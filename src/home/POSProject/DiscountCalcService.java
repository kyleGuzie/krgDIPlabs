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
 */
public class DiscountCalcService{

    private ProductDiscountStrategy ds;
   // private int quanity;

    public final ProductDiscountStrategy getCalcServiceDs() {
        return ds;
    }

    public final void setCalcServiceDs(ProductDiscountStrategy ds) {
        this.ds = ds;
    }

//    public final int getCalcServiceQuanity() {
//        return quanity;
//    }
//
//    public final void setCalcServiceQuanity(int quanity) {
//        this.quanity = quanity;
//    }
//
//    public double calculateProductDiscount(double cost, int qty) {
//        return ds.calculateDiscount(cost, qty);
//    }

//    public DiscountCalcService(ProductDiscountStrategy ds) {
//        .s
//        setCalcServiceDs(ds);
//        .setProductCost(ds.calculateDiscount(Product), quanity));
//        setCalcServiceQuanity(quanity);
//
//    }
}
