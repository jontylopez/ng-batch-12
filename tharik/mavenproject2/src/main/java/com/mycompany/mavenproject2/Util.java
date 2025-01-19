/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author hd
 */
public class Util {
    public static boolean authenticate(String username, String password) {
        // Need to authenticate properly
        return username != null && password != null 
                && username.equals("admin") && password.equals("admin");
    }
}
