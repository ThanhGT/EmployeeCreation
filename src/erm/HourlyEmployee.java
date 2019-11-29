
package erm;

import java.text.DecimalFormat;

/*
 * Title: HourlyEmployee
 * Objective: Create an HourlyEmployee Class
 * Author: ThanhTran 
 * Student#: 991525427
 * Date: February 10, 2019
 */

/**
 * represents employees that are hourly based
 * @author thanhtran
 */

public class HourlyEmployee extends Employee {

    int numHours;
    double hourlyRate;

    /**
     * 
     * @param id id of employee
     * @param firstName first name of employee
     * @param lastName last name of employee
     * @param numHours hours worked of employee
     * @param hourlyRate hourly rate of employee
     */
    
    public HourlyEmployee(int id, String firstName, String lastName, int numHours, double hourlyRate) {
    
        super(id, firstName, lastName);
        this.numHours = numHours;
        this.hourlyRate = hourlyRate;
    }

    /**
     * 
     * @return number of hours 
     */
    
    public int getNumHours() {
        return numHours;
    }

    /**
     * 
     * @return hourly rate earned by employee
     */
    
    public double getHourlyRate() {
        return hourlyRate;
    }
   
    /**
     * 
     * @return employees hourly pay: numHours * hourlyRate 
     */
    
    @Override
    public double calculatePay() {
        return this.numHours * this.hourlyRate;
    }
    
    /**
     * 
     * @return employee info
     */
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("0.00");
        String s = this.id + ": " + this.lastName + ", " + this.firstName + "\n Hours: " + df.format(this.numHours) + "\n Rate: $" +df2.format(this.hourlyRate);
        return s;
    }
    
}
