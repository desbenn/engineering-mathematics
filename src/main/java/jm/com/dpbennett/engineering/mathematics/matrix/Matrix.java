package jm.com.dpbennett.engineering.mathematics.matrix;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/**
 *
 * @author Desmond Bennett
 */
public class Matrix {

    public static void main(String[] args) {

        // Create a real matrix with two rows and three columns, using a factory
        // method that selects the implementation class for us.
        double[][] matrixData = {{1d, 2d, 3d}, {2d, 5d, 3d}};
        RealMatrix m = MatrixUtils.createRealMatrix(matrixData);
        System.out.println("m: " + m);

        // One more with three rows, two columns, this time instantiating the
        // RealMatrix implementation class directly.
        double[][] matrixData2 = {{1d, 2d}, {2d, 5d}, {1d, 7d}};
        RealMatrix n = new Array2DRowRealMatrix(matrixData2);
        System.out.println("n: " + n);

        // Now multiply m by n
        RealMatrix p = m.multiply(n);
        System.out.println(p.getRowDimension());    // 2
        System.out.println(p.getColumnDimension()); // 2

        // Invert p, using LU decomposition
        RealMatrix pInverse = new LUDecomposition(p).getSolver().getInverse();

        // Scalar multiply
        p = p.scalarMultiply(2);

    }
}
