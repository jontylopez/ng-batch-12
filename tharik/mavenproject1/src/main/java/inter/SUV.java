/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;

/**
 *
 * @author hd
 */
public class SUV implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving 4 wheels");
    }

    @Override
    public void consume() {
        System.out.println("Consuming diesel");
    }
    
}
