/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.POSProject;

/**
 *  10-3-2012 3:02PM
 * class description
 *
 * @author Kyle Guzikowski
 * @version 1.2
 *
 */
public class Product {

    ProductDiscountStrategy discountStrategy;
    private String id;
    private String name;
    private String description;
    //enum department  PRODUCT STRATEGY?????????
    private String size;
    private double cost;
    public int quanity;
    private String dept;

    /**
     *
     */
    public enum Department {

        MEN, WOMEN, CHILDREN, TOYS, JEWLREY, SHOES
    };
    private Department de;

    /**
     *
     * @return
     */
    public final Department getDe() {
        return de;
    }

    /**
     *
     * @param de
     */
    public final void setDe(Department de) {
        this.de = de;
    }

    /**
     *
     * @param id
     * @param name
     * @param description
     * @param cost
     * @param ds
     */
    public Product(String id, String name, String description, double cost, ProductDiscountStrategy ds) {
        setProductId(id);
        setProductName(name);
        setProductDescription(description);
        setProductCost(cost);
        setDiscountStrategy(ds);

    }

    /**
     *
     * @param id
     * @param name
     * @param description
     * @param size
     * @param cost
     * @param discountStrategy
     * @param dept
     */
    public Product(String id, String name, String description, String size, double cost, ProductDiscountStrategy discountStrategy, Department dept) {
        setProductId(id);
        setProductName(name);
        setProductDescription(description);
        setProductSize(size);
        setProductCost(cost);
        setDiscountStrategy(discountStrategy);
        setDe(de);
    }

    /**
     *
     * @param discountStrategy
     */
    public final void setDiscountStrategy(ProductDiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /**
     *
     * @param qty
     * @return
     */
    public double getItemsCalculatedDiscount(int qty) {
        return discountStrategy.calculateDiscount(getProductCost(), qty);

    }

    /**
     *
     * @return products size either number or smlxlxxlxxxl
     */
    public final String getProductSize() {
        return size;
    }

    /**
     *
     * @param size
     */
    public final void setProductSize(String size) {
        this.size = size;
    }

    //ServiceCalc services;
    /**
     *
     * @return Products Id for product look up
     */
    public final String getProductId() {
        return id;
    }

    /**
     *
     * @param id sets product id
     */
    public final void setProductId(String id) {
        this.id = id;
    }

    /**
     *
     * @return product name
     */
    public final String getProductName() {
        return name;
    }

    /**
     *
     * @param name sets product name
     */
    public final void setProductName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the products description
     */
    public final String getProductDescription() {
        return description;
    }

    /**
     *
     * @param description sets product description
     */
    public final void setProductDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return products original cost before discount
     */
    public final double getProductCost() {
        return cost;
    }

    /**
     *
     * @param cost
     */
    public final void setProductCost(double cost) {
        this.cost = cost;
    }
}
