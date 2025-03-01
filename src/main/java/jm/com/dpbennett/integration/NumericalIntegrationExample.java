package jm.com.dpbennett.integration;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;

public class NumericalIntegrationExample {

    public static void main(String[] args) {
        // Define the function to integrate: f(x) = x^2
        UnivariateFunction function = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return Math.log(x) * Math.sin(x);
            }
        };

        // Create an instance of a SimpsonIntegrator
        UnivariateIntegrator integrator = new SimpsonIntegrator();

        // Define the integration interval [a, b]
        double lowerBound = 1.0;
        double upperBound = 2.0;

        // Perform the integration
        double result = integrator.integrate(1000, function, lowerBound, upperBound);

        // Output the result
        System.out.println("The integral of Math.log(x) * Math.sin(x) from 1 to 2 is: " + result);
    }
}
