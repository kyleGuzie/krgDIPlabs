/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSHome.Three;

/**
 *
 * @author bossMan
 */
public class NoDiscount extends Product  implements DiscountCalcStrategyInterface{

    @Override
    public double getDiscount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
