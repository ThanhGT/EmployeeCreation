
package erm;

/*
 * Title: Employee Class
 * Objective: Create an Employee Class
 * Author: ThanhTran 
 * Student#: 991525427
 * Date: February 10, 2019
 */

/**
 * abstract class to model employees
 * @author thanhtran
 */

public abstract class Employee {

    int id = 0;
    String firstName;
    String lastName;

    /**
     * 
     * @param id employee id
     * @param firstName first name of employee
     * @param lastName last name of employee
     */
    
    protected Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * 
     * @return returns id
     */
    
    public int getId() {
        return this.id;
    }

    /** 
     * 
     * @param id id of employee 
     */
    
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return firstName
     */
    
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName name of Employee 
     */
    
    public void setFirstName(String firstName) {
                 
            this.firstName = firstName;
        
    }

    /**
     * 
     * @return last name of employee 
     */
    
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName last name of employee
     */
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /** 
     * 
     * @return calculatePay
     */
    
    public abstract double calculatePay ();
    
    /**
     * 
     * overrides the toString method. 
     * Instantiates the String s variable which is used by all of its subclasses.
     * @return s
     */
    
    @Override
    public String toString(){
        String s = "";
        return s;
    }
}
