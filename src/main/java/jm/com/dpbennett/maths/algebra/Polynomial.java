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

        // Test for positive roots
        for (int i = 1; i < 4; i++) {
            System.out.println("Value of expressopion with i = " + i + " is "
                    + Polynomial.cubicExpression(i, 1, -2, -5, 6));
        }
        // Test for negative roots
        for (int i = -1; i > -4; i--) {
            System.out.println("Value of expressopion with i = " + i + " is "
                    + Polynomial.cubicExpression(i, 1, -2, -5, 6));
        }

    }

    /*
        Exp: a*x^3 + b*x^2 + c*x + d    
        E.g.: x^3 − 2x^2 − 5*x + 6
     */
    public static double cubicExpression(
            double x, double a, double b, double c, double d) {

        return a * pow(x, 3) + b * pow(x, 2) + c * x + d;
    }

    /*
        Exp: a*x^2 + b*x + c    
        E.g.: x^2 − 2x − 5
     */
    public static double quadraticExpression(
            double x, double a, double b, double c) {

        return a * pow(x, 2) + b * x + c;
    }

}
