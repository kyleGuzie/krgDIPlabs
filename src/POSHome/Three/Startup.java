/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSHome.Three;

/**
 *
 * @author bossMan
 */
public class Startup {
    public static void main(String[] args) {
        DiscountCalcStrategyInterface cs = new NoDiscount();
        System.out.println("" + cs.getDiscount());
        //cs.getDiscount();
    }

}
