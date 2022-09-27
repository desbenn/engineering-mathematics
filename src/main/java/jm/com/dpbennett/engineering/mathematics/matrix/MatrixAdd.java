package jm.com.dpbennett.engineering.mathematics.matrix;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/**
 *
 * @author Desmond Bennett
 */
public class MatrixAdd {

    public static void main(String[] args) {
        
        // Matrix m
        double[][] matrixData = {{2.0d, -1.0d}, {-7.0d, 4.0d}};
        RealMatrix m = MatrixUtils.createRealMatrix(matrixData);

        // Matix n
        double[][] matrixData2 = {{-3.0d, 0d}, {7.0d, -4.0d}};
        RealMatrix n = MatrixUtils.createRealMatrix(matrixData2);

        // Now add m by n
        RealMatrix p = m.add(n);
        System.out.println("m + n = " + p);

    }
}
