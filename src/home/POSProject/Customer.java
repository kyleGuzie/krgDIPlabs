/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.POSProject;

/**
 * class Description: customer class will create a customer object that will
 * store: customerId, customerName, customerAddress, rewardPoints
 *
 * -also i think its practical to add a "gimic" so i also think an attribute
 * called "rewardPoints" so customers can earn points for shopping
 *
 *
 * @author Kyle Guzikowski
 * @version 1.2 POS_ homeLabs
 *
 */
public class Customer {

    private String name;
    private String id;
    private String address;
    //asigned the val of 0 because if a new customer 0 reward points
    private int rewardPoint = 0;

    public Customer(String id, String name, String address) {
        setCustomerId(id);
        setCustomerName(name);
        setCustomerAddress(address);

    }

    //-----setters--with validation.. throw exception to an output class
    /**
     *
     * @return customers name
     */
    public final String getCustomerName() {
        return name;
    }

    /**
     *
     * @return customers ID
     */
    public final String getCustomerId() {
        return id;
    }

    /**
     *
     * @return customers address
     */
    public final String getCustomerAddress() {
        return address;
    }

    /**
     *
     * @return customers reward points
     */
    public final int getCustomerRewardPoint() {
        return rewardPoint;
    }

    //-----setters--with validation.. throw exception to an output class
    public final void setCustomerName(String name) {
        this.name = name;
    }

    public final void setCustomerAddress(String address) {
        this.address = address;
    }

    public final void setCustomerId(String id) {
        this.id = id;
    }

    public final void setCustomerRewardPoint(int rewardPoint) {
        this.rewardPoint = rewardPoint;
    }
}
