/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erpapp;

import erpbl.Person;
import erpbl.DBUtils;

/**
 *
 * @author hd
 */
public class MongoDBUtils implements DBUtils {

    @Override
    public Person[] getPersons() {
        // Logic to read from MySQL DB
        Person[] persons = new Person[3];
        persons[0] = new Person("123V", "Lewis", "Hamilton", "1985");
        persons[1] = new Person("123V", "Max", "Verstapann", "1985");
        persons[2] = new Person("123V", "Charles", "Leclerc", "1985");
        return persons;
    }

    @Override
    public boolean addPerson(Person p) {
       // Add to MySQL DB Logic
       return true;
    }
}