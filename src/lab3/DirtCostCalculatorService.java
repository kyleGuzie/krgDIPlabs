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
class DirtCostCalculatorService {
    CostCalcStrategy ccs;

    public double getTotalSaleCost(CostCalcStrategy ccs){
        return ccs.getCost();
    }

}
