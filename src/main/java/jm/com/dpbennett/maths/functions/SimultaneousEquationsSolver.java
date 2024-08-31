package jm.com.dpbennett.maths.functions;

import org.apache.commons.math3.linear.*;

public class SimultaneousEquationsSolver {

    public static void main(String[] args) {
        // Define the coefficient matrix A
        double[][] coefficients = {
            {1, -8},
            {9, -1}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(coefficients);

        // Define the constant vector B
        double[] constants = {-20, 33};
        RealVector vector = MatrixUtils.createRealVector(constants);

        // Solve the system of equations
        DecompositionSolver solver = new LUDecomposition(matrix).getSolver();
        RealVector solution = solver.solve(vector);

        // Print the solution
        System.out.println("Solution: ");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.println("x" + (i + 1) + " = " + solution.getEntry(i));
        }
    }
}
