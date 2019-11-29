
package erm;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Title: ERM
 * Objective: A program that create employees based on salary, hour and commission and displays a payroll report or employee report
 * Author: ThanhTran 
 * Student#: 991525427
 * Date: February 10, 2019
 */

/** 
 * runs the main method that calls all other classes
 * @author thanhtran
 */

public class ERM {
    
    /**
     * 
     * @param employeeList represents a list of employees
     */
             
    // a method that displays the employee info use the toString method
    public static void displayEmployeeInfo (Employee[] employeeList) {       
        for (Employee e : employeeList) {
            System.out.println("Employee: " + e.toString());                
        }
    }
    
    /**
     * 
     * @param employeeList represents a list of employees
     */
    
    // a method that displays Employee Payroll DOES NOT use the toString method
    public static void displayEmployeePayroll (Employee[] employeeList) {     
        for (Employee e : employeeList) {
            System.out.printf("Weekly pay for %s, %s employee id %d is $%.2f \n", e.getLastName(), e.getFirstName(), e.getId(), e.calculatePay());  
        }
    }

    /** 
     * Method that checks for the employee ID to make sure it is unique
     * @param id id of employee
     * @param idList listing containing all employee IDs
     * @return Returns true if id is unique, false otherwise.
     */
    
    public int checkID(int id, ArrayList<Integer> idList) {
        Scanner input = new Scanner (System.in);
        int myId;
        int thisId = id;
        
        for (int i=0; i<idList.size();i++) {
           while (idList.get(i) == thisId) {           
                System.out.println("Please enter a unique ID. The ID entered has already been used");
                thisId = input.nextInt();
            }
        }
        myId = thisId;
        return myId;
    }
    
    /**
     * 
     * @param args runs the main method 
     */
    
    public static void main(String[] args) {
        
        int choice, tempId, id;
        
        System.out.println("How many employees would you like to create?");
        Scanner input = new Scanner (System.in);

        ERM ermInstance = new ERM(); //create an instance of the ERM class in order to use its methods

        int numEmployees = input.nextInt();
        
        ArrayList <Integer> idListing = new ArrayList<>();

        Employee[] allEmployeesList = new Employee[numEmployees];
                 
        // Main for loop
        for (int i = 0; i < numEmployees; i++) {
            // ask the user to set up the employees salary type
            System.out.println("Employee data for employee " + (i+1) + " of " + numEmployees);
            System.out.println("Choose the type of employee to add: ");
            System.out.println("1. Salaried");
            System.out.println("2. Hourly");
            System.out.println("3. Commission");
            choice = input.nextInt();

            switch (choice) {

                case 1: //Salaried Employees
                    
                        // ask the user to enter the employees id and check if unique
                        System.out.println("Please enter an ID for employee #" + (i+1) + ": ");
                        tempId = input.nextInt();
                        id = ermInstance.checkID(tempId, idListing);
                        idListing.add(id);
                       
                        // ask the user to enter the employees first name
                        System.out.println("Please enter the employees first name: ");
                        String firstName = input.next();
                        
                        // ask the user to enter the employees last name
                        System.out.println("Please enter the employees last name: ");
                        String lastName = input.next();
                        
                        System.out.println("Salary: ");
                        double salary = input.nextDouble();
                        
                        //create new Salary Employee with the info and add it to the Salary Employee Array
                        SalaryEmployee newSalaryEmp = new SalaryEmployee(id, firstName, lastName, salary);
                        allEmployeesList[i] = newSalaryEmp; //add newly created salary employee to the list of all employees
                        
                        break;
                case 2: //Hourly Employees
                    
                        // ask the user to enter the employees id and check if unique
                        System.out.println("Please enter an ID for employee #" + (i+1) + ": ");
                        tempId = input.nextInt();
                        id = ermInstance.checkID(tempId, idListing);
                        idListing.add(id);
                                             
                        // ask the user to enter the employees first name
                        System.out.println("Please enter the employees first name:");
                        firstName = input.next();
                        // ask the user to enter the employees last name
                        System.out.println("Please enter the employees last name: ");
                        lastName = input.next();
                        
                        System.out.println("Hours Worked: ");
                        int hoursWorked = input.nextInt();
                        
                        System.out.println("Hourly Rate: ");
                        double hourly = input.nextDouble();
                        
                        //create new Hourly Employee with the info and add it to the Hourly Employee Array
                        HourlyEmployee newHourlyEmp = new HourlyEmployee(id, firstName, lastName, hoursWorked, hourly);
                        allEmployeesList[i] = newHourlyEmp; //add newly created hourly employee to the list of all employees

                        break;
                        
                case 3: //Commmissioned Employees
                    
                        // ask the user to enter the employees id and check if unique
                        System.out.println("Please enter an ID for employee #" + (i+1) + ": ");
                        tempId = input.nextInt();
                        id = ermInstance.checkID(tempId, idListing);
                        idListing.add(id);
                                                                        
                        System.out.println("Please enter the employees first name:");
                        firstName = input.next();
                        // ask the user to enter the employees last name
                        System.out.println("Please enter the employees last name: ");
                        lastName = input.next();
                        
                        System.out.println("Commission Rate: ");
                        double commission = input.nextDouble();
                        System.out.println("Sales: ");
                        double sales = input.nextDouble();                      
                        
                        //create new Commission Employee with the info and add it to the Commmission Employee Array
                        CommissionEmployee newComEmp = new CommissionEmployee(id, firstName, lastName, commission, sales);
                        allEmployeesList[i] = newComEmp; //add newly created commission employee to the list of all employees
                       
                        break;
                default: System.out.println("Please enter a valid number ");
                        
            }  // end of switch
            
        } // end of for loop
        
        do {
            System.out.println("Choose a report: ");
            System.out.println("1. Employee Listing ");
            System.out.println("2. Payroll Listing ");
            System.out.println("3. Exit");
            choice = input.nextInt();
                        
            switch (choice) {
                
                case 1: 
                      displayEmployeeInfo(allEmployeesList);
                    break;
                case 2:
                     displayEmployeePayroll(allEmployeesList);
                    break;
                case 3: 
                    break;
                default: 
                    System.out.println("Please enter a valid number: ");
                    break;
            }
            
        } while (choice != 3);
                
    }   // end of main
}   // end of class
