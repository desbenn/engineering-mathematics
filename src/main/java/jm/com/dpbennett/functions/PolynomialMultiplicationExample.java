package jm.com.dpbennett.functions;

import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;

public class PolynomialMultiplicationExample {

    public static void main(String[] args) {
        // Define two polynomials: p1(x) = 2 + 3x + 5x^2
        double[] coefficients1 = {2, 3, 5};
        PolynomialFunction p1 = new PolynomialFunction(coefficients1);

        // Define another polynomial: p2(x) = 1 + 2x
        double[] coefficients2 = {1, 2};
        PolynomialFunction p2 = new PolynomialFunction(coefficients2);

        // Multiply the two polynomials
        PolynomialFunction product = multiplyPolynomials(p1, p2);

        // Print the resulting polynomial coefficients
        System.out.println("Resulting polynomial coefficients:");
        for (double coeff : product.getCoefficients()) {
            System.out.print(coeff + " ");
        }
    }

    public static PolynomialFunction multiplyPolynomials(PolynomialFunction p1, PolynomialFunction p2) {
        // Get the coefficients of the two polynomials
        double[] coeffs1 = p1.getCoefficients();
        double[] coeffs2 = p2.getCoefficients();

        // The degree of the resulting polynomial will be the sum of the degrees of the input polynomials
        double[] productCoeffs = new double[coeffs1.length + coeffs2.length - 1];

        // Multiply the coefficients
        for (int i = 0; i < coeffs1.length; i++) {
            for (int j = 0; j < coeffs2.length; j++) {
                productCoeffs[i + j] += coeffs1[i] * coeffs2[j];
            }
        }

        // Return the resulting polynomial
        return new PolynomialFunction(productCoeffs);
    }
}
