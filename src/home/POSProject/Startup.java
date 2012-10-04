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
 *
 *
 *
 */
public class Startup {

    public static void main(String[] args) {
        //customer id has a "A" old customer "b" new customer with 0 reward points
        Customer c1 = new Customer("a0001", "John Williams", "563 East Farwell  Milwaukee, Wi");
        Customer c2 = new Customer("b2012", "Susan Rogers", "7487 North 6th Street Beloit, Wi");
        Customer c3 = new Customer("a4457", "Sam Smith", "442 East Broadway Waukesha, Wi");
        Customer c4 = new Customer("a5427", "Dan Keiser", "8060 South 58th Street Oak Creek, Wi");
        Customer c5 = new Customer("b2012", "Susan Rogers", "15648 Willow Park Place Wisconsin Rapids, Wi");

        c1.setCustomerRewardPoint(1478);
        c3.setCustomerRewardPoint(19874);
        c4.setCustomerRewardPoint(87491);


        ProductDiscountStrategy nd = new NoDiscount();
        ProductDiscountStrategy pd = new PercentageDiscount();
        ProductDiscountStrategy qd = new QuanityDiscount();



        Product p1 = new Product("0004789", "Mens Shorts", "Classic Shorts - Mens 34 - color green", 18.92, nd);
        Product p2 = new Product("0007854", "Womens Skirt", "Black Seasonal Summer", "small", 32.40, pd, (Product.Department.MEN));
        Product p3 = new Product("0774109", "Mens Shorts", "Vintage Shirt - Mens XL - color green", 19.99, nd);
        Product p4 = new Product("0084512", "Mens Pants", "Work Pants - Mens 44 - color black", 44.50, qd);
        Product p5 = new Product("0024575", "Mens Shoes", "Classic Nikes  - Mens 11.5 - color black/grey", 85.40, nd);

//        //collection of Products
//        Product[] products = {p1, p2, p3, p4, p5};
//
//        for (Product p : products) {
//            System.out.println("_________________________");
//            System.out.println("| Product UPC:");
//            System.out.println("| " + p.getProductId());
//            System.out.println("| Product Name:");
//            System.out.println("| " + p.getProductName());
//            System.out.println("| Product Description: \n");
//            System.out.println("| " + p.getProductDescription());
//            System.out.println("| Product Price:");
//            System.out.println("| " + p.getProductCost());
//            System.out.println("| Product Discounted Price:");
//            System.out.println("| " + (p.getProductCost() - p.getItemsCalculatedDiscount(19)));
//
//        }

        String idRdm = "a0001";
        Receipt r = new Receipt();
        r.findCustomer(idRdm);
        System.out.println("" +  r.getCustomer().getCustomerName());



//            //collection of Customers
//            Customer[] customers = {c1, c2, c3, c4, c5 };
//
//            //process info for customers
//            for(Customer c: customers){
//
//            System.out.println("|_____________________________|");
//            System.out.println("|   Date: "   );
//            System.out.println("|   Customer ID: "  + c.getCustomerId());
//            System.out.println("|   Name: "  + c.getCustomerName());
//            System.out.println("|   Address: "  + c.getCustomerAddress());
//            System.out.println("|   Reward Points: "  + c.getCustomerRewardPoint());
//            System.out.println("|_____________________________|");
//            }
//
//




    }
}
