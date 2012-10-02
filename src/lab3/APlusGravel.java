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
public class APlusGravel implements CostCalcStrategy{
    private static final double FINE_RATE_YARD = 20;
    private static final double COURSE_RATE_YARD = 30;
    private static final double LOOSE_RATE_YARD = 40;

    private static final double MIN_LOAD = 5;
    private static final double MAX_LOAD = 20;

    private static final String LOAD_MESSAGE = "the load amount must be a min of " +
            MIN_LOAD + "cubic yards, and " + MAX_LOAD;
   public enum DirtQuality {
           FINE, COURSE, LOOSE
    };

    private DirtQuality dirtQuality;
    private double loadAmount;




    public DirtQuality getDirtQuality() {
        return dirtQuality;
    }

    public void setDirtQuality(DirtQuality dirtQuality) {
        this.dirtQuality = dirtQuality;
    }

    public double getLoadAmount() {
        return loadAmount;
    }

    public void setLoadAmount(double loadAmount) {
        this.loadAmount = loadAmount;
    }

    public APlusGravel(DirtQuality dirtQuality, double loadAmount) {
        this.dirtQuality = dirtQuality;
        this.loadAmount = loadAmount;
    }

        @Override
    public double getCost() {
        double cost = 0.0;

        switch(dirtQuality){

            case FINE:
                cost = loadAmount * FINE_RATE_YARD;
                break;
            case COURSE:
                cost = loadAmount * COURSE_RATE_YARD;
                break;
            case LOOSE:
                cost = loadAmount * LOOSE_RATE_YARD;
                break;
            default:
                throw new AssertionError(dirtQuality.name());
        }
        return cost;

        }



    }




