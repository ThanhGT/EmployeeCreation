
package erm;

import java.text.DecimalFormat;

/*
 * Title: CommisionEmployee
 * Objective: Create a CommisionEmployee Class
 * Author: ThanhTran 
 * Student#: 991525427
 * Date: February 10, 2019
 */

/**
 * represents employees that are commission based
 * @author thanhtran
 */

public class CommissionEmployee extends Employee {

    double rate;
    double sales;

    public CommissionEmployee(int id, String firstName, String lastName, double rate, double sales) {
        super(id, firstName, lastName);
        this.rate = rate;
        this.sales = sales;
        
    }

    /** 
     * 
     * @return rate 
     */
    
    public double getRate() {
        return rate;
    }

    /** 
     * 
     * @return sales
     */
    
    public double getSales() {
        return sales;
    }
    
    /**
     * 
     * @return pay (sales * rate / 100)
     */
    
    @Override
    public double calculatePay () {
        return this.sales * this.rate/100;
    }
    
    /** 
     * 
     * @return employee's info
     */
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("0.00");
        String s = this.id + ": " + this.lastName + ", " + this.firstName + "\n Commission Rate: " + df.format(this.rate) + "\n Sales: $" + df2.format(this.sales);
        return s;
    }
}
