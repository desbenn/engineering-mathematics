package jm.com.dpbennett.functions;

import org.apache.commons.math3.analysis.MultivariateFunction;

public class MyMultivariateFunction implements MultivariateFunction {

    @Override
    public double value(double[] point) {
        // Assuming point is an array where point[0] is x and point[1] is y
        double x = point[0];
        double y = point[1];
        return x * x + y * y;
    }

    public static void main(String[] args) {
        MyMultivariateFunction function = new MyMultivariateFunction();

        // Example usage: calculate f(3, 4)
        double result = function.value(new double[]{3.0, 4.0});
        System.out.println("f(3, 4) = " + result);
    }
}
