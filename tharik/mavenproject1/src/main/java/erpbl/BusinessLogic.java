/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erpbl;

/**
 *
 * @author hd
 */
public class BusinessLogic {
    public void process(DBUtils utils) {
        
        for(Person p : utils.getPersons()) {
             System.out.println("Processing " + p.getFirstName());
        }
    }
}
