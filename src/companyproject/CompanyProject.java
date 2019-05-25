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
public class CompanyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company stayreal = new Company();
        stayreal.setAddress("here");
        stayreal.setCompanyName("stay real");
        
        Department d1 = new Department();
        Department d2 = new Department();
        
        d1.setDepartmentName("accounting");
        d2.setDepartmentName("programming");
        
        Employee aya = new Employee();
        Employee kerdi = new Employee();
        Employee Hocine = new Employee();
        
        aya.setDatejoined("1/1/2019");
        aya.setName("Aya Mustafa");
        aya.setSalary(10000);
        
        kerdi.setDatejoined("1/1/2019");
        kerdi.setName("Mohamed Kerdi");
        kerdi.setSalary(10000);
        
        Hocine.setDatejoined("1/1/1990");
        Hocine.setName("Hocine Zibouche");
        Hocine.setSalary(40000);
        
        Trainee yomna = new Trainee();
        Trainee khalid = new Trainee();
        
        yomna.setDatejoined("1/1/2009");
        yomna.setEndTrainingDate("1/2/2009");
        yomna.setName("Yomna");
        yomna.setSalary(0);
        
        khalid.setDatejoined("1/1/2009");
        khalid.setEndTrainingDate("1/2/2009");
        khalid.setName("khalid");
        khalid.setSalary(0);
        
        stayreal.addDeparment(d1);
        stayreal.addDeparment(d2);
        
        ArrayList<Department> d = stayreal.getDepartments();
        
        for(int i=0;i<d.size();i++)
        {
            System.out.println(d.get(i).getDepartmentName());
        }
    }
    
}
