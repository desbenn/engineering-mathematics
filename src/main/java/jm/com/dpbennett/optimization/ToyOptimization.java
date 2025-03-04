package jm.com.dpbennett.optimization;

import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.LinearConstraint;
import org.apache.commons.math3.optim.linear.LinearConstraintSet;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optim.linear.NonNegativeConstraint;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.linear.SimplexSolver;

public class ToyOptimization {

    public static void main(String[] args) {
        // Step 1: Define the objective function coefficients (maximize profit)
        LinearObjectiveFunction objectiveFunction = 
                new LinearObjectiveFunction(new double[]{3, 2}, 0);

        // Step 2: Define the constraints
        Collection<LinearConstraint> constraints = new ArrayList<>();

        // Carpentry shop constraint: x + y ≤ 80
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 80));

        // Finishing shop constraint: 2x + y ≤ 100
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, 100));

        // Toy soldier constraint: x ≤ 40
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 40));

        // Non-negativity constraints: x ≥ 0, y ≥ 0
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.GEQ, 0));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 0));

        // Step 3: Solve the problem
        LinearConstraintSet constraintSet = new LinearConstraintSet(constraints);
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(
                new OptimizationData[]{
                    objectiveFunction,
                    constraintSet,
                    GoalType.MAXIMIZE,
                    new NonNegativeConstraint(true)
                });

        // Step 4: Output results
        if (solution != null) {
            double x = solution.getPoint()[0]; // Number of toy soldiers
            double y = solution.getPoint()[1]; // Number of toy trains
            double maxProfit = solution.getValue(); // Maximum profit

            System.out.println("Optimal Solution:");
            System.out.println("Number of Toy Soldiers: " + x);
            System.out.println("Number of Toy Trains: " + y);
            System.out.println("Maximum Profit: $" + maxProfit);
        } else {
            System.out.println("No solution found!");
        }
    }
}
