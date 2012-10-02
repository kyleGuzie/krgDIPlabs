/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.NumberFormat;

/**
 *
 * @Kyle Guzikowski
 * @version 1.00 9/30/12
 */
public class Startup {
    public static void main(String[] args) {

        //
        NumberFormat nf = NumberFormat.getCurrencyInstance();


        //HourlyEmplyees
        HourlyEmployee emp1 = new HourlyEmployee(15.40, 6852);
        HourlyEmployee emp2 = new HourlyEmployee(17.20, 4822);
        //SalaryEmployees
        SalariedEmployee emp3 = new SalariedEmployee(15840, 1000);
        SalariedEmployee emp4 = new SalariedEmployee(85000, 7894);

        //collection of employees
        Employee[] emplys = { emp1, emp2, emp3, emp4};

        //HighLevel
        HRService service = new HRService();

        for(Employee e : emplys){

            System.out.println("Annual wage is..." + nf.format( service.hrServiceReportAnnualEmployeeWages(e)));
        }


        




    }

}
