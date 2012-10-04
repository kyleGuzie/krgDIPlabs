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
 *
 */
public class Receipt {

    Customer customer;
    LineItem[] lineItem;

    public Customer getCustomer() {
        return customer;
    }

    public void findCustomer(String customerId) {
        if(customer.getCustomerId().equals(customerId)){
            this.customer = customer;
        }else{
            this.customer = new Customer( null, null, null);

        }


    }

    public LineItem[] getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem[] lineItem) {
        this.lineItem = lineItem;
    }


}
