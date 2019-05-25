/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyproject;

import java.util.ArrayList;

/**
 *
 * @author mosaabramadan
 */
public class Employee {
    private String name;
    private int salary;
    private String datejoined;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the datejoined
     */
    public String getDatejoined() {
        return datejoined;
    }

    /**
     * @param datejoined the datejoined to set
     */
    public void setDatejoined(String datejoined) {
        this.datejoined = datejoined;
    }
}
