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
public class Company {
    private String companyName;
    private String address;
    private ArrayList<Department> Departments = new ArrayList<Department>();

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the Departments
     */
    public ArrayList<Department> getDepartments() {
        return Departments;
    }

    /**
     * @param Departments the Departments to set
     */
    public void setDepartments(ArrayList<Department> Departments) {
        this.Departments = Departments;
    }
    
    public void addDeparment(Department x)
    {
        Departments.add(x);
    }
    public void removeDepartment(Department x)
    {
        for(int i=0;i<this.Departments.size();i++)
        {
            if(x.getDepartmentName().equals(this.Departments.get(i).getDepartmentName()))
            {
                this.Departments.remove(i);
            }
            
        }
    }
}
