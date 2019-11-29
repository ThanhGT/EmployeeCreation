
package erm;

import java.text.DecimalFormat;

/*
 * Title: SalaryEmployee
 * Objective: Create a SalaryEmployee Class
 * Author: ThanhTran 
 * Student#: 991525427
 * Date: February 10, 2019
 */

/**
 * represents employees that are salary based
 * @author thanhtran
 */

public class SalaryEmployee extends Employee {

    double salary;

    /**
     * 
     * @param id return employees id
     * @param firstName return first name of employee
     * @param lastName return last name of employee
     * @param salary return salary of employee
     */
    
    public SalaryEmployee(int id, String firstName, String lastName, double salary) {
        
        super(id, firstName, lastName);
        this.salary = salary;
        
    }

    /** 
     * 
     * @return salary of employee 
     */
    
    public double getSalary() {
        return salary;
    }
    
    /** 
     * 
     * @return salary of employee at a weekly rate  
     */
    
    @Override
    public double calculatePay() {
        return this.salary/52;
    }
    
    /**
     * 
     * @return info of a salary based employee 
     */
    
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String s = this.id + ": " + this.lastName + ", " + this.firstName + "\n Salary: $" + df.format(this.salary) ;
        return s;
    }
    
}
