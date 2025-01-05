/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author hd
 */
public class Employee extends Person {
    private String epfNo;
    private double salary;

    public Employee() {
    }

    public Employee(String epfNo, double salary, String nic, String firstName, String lastName, String dateOfBirth) {
        super(nic, firstName, lastName, dateOfBirth);
        this.epfNo = epfNo;
        this.salary = salary;
    }  
    
    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String getNic() {
        return  "NIC" + super.getNic();
    }
}
