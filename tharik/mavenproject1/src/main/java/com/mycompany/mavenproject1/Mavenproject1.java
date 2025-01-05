/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author hd
 */
public class Mavenproject1 {

    public static void main(String[] args) { 
        Person person = new Person("123V", "Lewis", "Hamilton", "1985");
        System.out.println(person.getNic());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getDateOfBirth());
        
        System.out.println("'***********************************");
        
        Employee employee = new Employee("44", 100.0, "123V", "Lewis", "Hamilton", "1985");
        System.out.println(employee.getNic());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getEpfNo());
        System.out.println(employee.getSalary());
        
        
        Person p = new Person();
        p = new Employee();
        p = new Student();
        
        Person[] persons = new Person[5];
        persons[0] = new Employee();
        persons[0] = new Student();
        persons[0] = new Employee();
        
        
    }
}
