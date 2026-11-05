package jm.com.dpbennett.ode;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;

public class SolveODE {

    // Define the differential equation y' = -2 * sin(2πx)
    static class MyODE implements FirstOrderDifferentialEquations {

        @Override
        public int getDimension() {
            return 1;  // Single equation
        }

        @Override
        public void computeDerivatives(double x, double[] y, double[] yDot) {
            yDot[0] = -2 * Math.sin(2 * Math.PI * x);
        }
    }

    public static void main(String[] args) {
        // Define the ODE system
        FirstOrderDifferentialEquations ode = new MyODE();

        // Use Dormand-Prince method for solving
        FirstOrderIntegrator integrator = 
                new DormandPrince853Integrator(1.0e-8, 10.0, 1.0e-10, 1.0e-10);

        double[] y0 = {1.0};  // Initial condition: y(0) = 1
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 2.0, y); // Solve from x = 0 to x = 2

        System.out.println("y(2) = " + y[0]);
    }
}
