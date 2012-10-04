/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSHome.Three;

/**
 *
 * @author bossMan
 */
public class DiscountCalcService {
    private DiscountCalcStrategyInterface discountStrategy;


    //discount strategy

    public DiscountCalcService() {
    }

    public final double getSaleDiscount(DiscountCalcStrategyInterface discountStrategy) {
        return this.discountStrategy.getDiscount();
    }

}
