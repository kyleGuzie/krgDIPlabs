/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @Kyle Guzikowski
 * @version 1.00 9/30/12
 */
public class HRService {

    private Employee e;

    public HRService(Employee employee) {
        this.e = employee;
    }

    public HRService() {
    }


    public final void setEmployee(Employee e) {
        this.e = e;
    }

    /**
     *
     * @param e
     * @return
     */
    public double hrServiceReportAnnualEmployeeWages(Employee e){
        return e.calculateAnnualWages();
    }

}
