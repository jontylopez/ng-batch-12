/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;

/**
 *
 * @author hd
 */
public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving 2 front wheels");
    }

    @Override
    public void consume() {
        System.out.println("Consuming petrol");
    }
    
}
