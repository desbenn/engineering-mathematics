package jm.com.dpbennett.statistics;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 *
 * @author Desmond Bennett
 */
public class StandardDeviation {

    public static void main(String[] args) {
        DescriptiveStatistics stats = new DescriptiveStatistics();
        Double inputArray[] = {5.0,6.0,8.0,4.0,10.0,3.0};

        // Add the data from the array
        for (Double inputArray1 : inputArray) {
            stats.addValue(inputArray1);
        }

        System.out.println("Mean: " + stats.getMean());
        System.out.println("Variance: " + stats.getVariance());
        System.out.println("STD: " + stats.getStandardDeviation());
                
    }
    
    

}
