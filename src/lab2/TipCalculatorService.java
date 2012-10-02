package lab2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @Kyle Guzikowski
 * @version 1.00 10/1/12
 */
public class TipCalculatorService {
    CalculateTipStrategy ts;

    public TipCalculatorService() {

    }

    //can use canstructor for passing in

    public double getTotalTip(CalculateTipStrategy  ts){
        return ts.getTip();
    }


}
