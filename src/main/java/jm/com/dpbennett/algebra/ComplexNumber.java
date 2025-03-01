
package jm.com.dpbennett.algebra;

//import org.apache.commons.numbers.core

import org.apache.commons.math3.complex.Complex;

/**
 *
 * @author Desmond Bennett
 */
public class ComplexNumber {
    public static void main(String[] args) {
        Complex cn1 = new Complex(1.0, 1.0);
        Complex cn2 = new Complex(2.0, 2.0);
        
        System.out.println("CN1 Abs: " + cn1.abs());
        
        System.out.println("CN1 + CN2: " + cn1.add(cn2));
    }
}
