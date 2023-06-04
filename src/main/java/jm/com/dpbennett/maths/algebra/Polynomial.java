/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.com.dpbennett.maths.algebra;

import static java.lang.Math.pow;

/**
 *
 * @author Desmond Bennett
 */
public class Polynomial {
    public static void main(String[] args) {
        
        new Polynomial().power(5, 2);
    }
    
    public void power(double x, double y) {
        System.out.println("x raised to power y: " + pow(x, y));
    }
}
