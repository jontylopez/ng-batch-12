/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author hd
 */
public class App {
        public static void main(String[] args) { 
            Test t = new Test();
            
            System.out.println(t.x); // 1
            System.out.println(Test.y); // 2
            
            Test t2 = new Test();
            t2.x = 10;
            t2.y = 20;
            
            System.out.println(t.x); // 1
            System.out.println(t.y); //2
        }
}
