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
public class Department {
    private String departmentName;
    private ArrayList<Employee> employees;
    private ArrayList<Trainee> trainees;

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    /**
     * @return the trainees
     */
    public ArrayList<Trainee> getTrainees() {
        return trainees;
    }

    /**
     * @param trainees the trainees to set
     */
    public void setTrainees(ArrayList<Trainee> trainees) {
        this.trainees = trainees;
    }

}
