/*
 * Copyright © Progmasters (QTC Kft.), 2016-2019.
 * All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed, 
 * publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including 
 * photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft. 
 * This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s 
 * students and for no other purposes by any parties other than QTC Kft.
 * This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
 * Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.
 */

package hu.progmasters.employee;

/**
 * Create a class called Employee that includes three pieces of information as instance variables
 *  - a first name (String)
 *  - a last name (String)
 *  - a monthly salary (double)
 *
 *  Your class should have a constructor that initializes the three instance variables.
 *  Provide a set and a get method for each instance variable.
 *  If the monthly salary is not positive, set it to 0.0.
 *
 *  Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.
 *  Create two Employee objects and display each object’s yearly salary.
 *  Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 *
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary < 0) {
            this.monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            this.monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public double countYearlySalary() {
        double yearlySalary = this.monthlySalary * 12;
        return yearlySalary;
    }

    public double raiseYearlySalaryWithTenPercent () {
        double raisedPayment = this.monthlySalary * 12 * 1.1;
        return raisedPayment;
    }
}
