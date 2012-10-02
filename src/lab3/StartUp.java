package lab3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @Kyle Guzikowski
 * @version 1.00 10/1/12
 */
public class StartUp {
    public static enum DirtQuality {
           FINE, COURSE, LOOSE
    };
    public static void main(String[] args) {

    DirtCostCalculatorService calcService = new DirtCostCalculatorService();
    CostCalcStrategy a = new APlusGravel(APlusGravel.DirtQuality.FINE, 6);

        System.out.println("Cost of yards of gravel is: $" + a.getCost());
    }





}


