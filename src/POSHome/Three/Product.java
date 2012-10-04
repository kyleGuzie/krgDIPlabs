/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POSHome.Three;

/**
 *
 * @author bossMan
 */
public class Product extends DiscountCalcService {
    private String id;
    private double cost;
    private double quanity;

    private DiscountCalcStrategyInterface service;

    public Product(String id, double cost, double quanity) {
        this.id = id;
        this.cost = cost;
        this.quanity = quanity;

    }

    public DiscountCalcStrategyInterface getService() {
        return service;
    }

    public void setService(DiscountCalcStrategyInterface service) {
        this.service = service;
    }





    public final double returnDiscountedPrice(){
       return service.getDiscount();
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final double getCost() {
        return cost;
    }

    public final void setCost(double cost) {
        this.cost = cost;
    }

    public final double getQuanity() {
        return quanity;
    }

    public final void setQuanity(double quanity) {
        this.quanity = quanity;
    }

    @Override
    public double getDiscount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
