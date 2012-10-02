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
public interface CalculateTipStrategy {
public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    double getTip();

}
