package jm.com.dpbennett.maths;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 *
 * @author Desmond Bennett
 */
public class Statistics {

    public static void main(String[] args) {
        DescriptiveStatistics stats = new DescriptiveStatistics();
        Double inputArray [ ] = {1.0, 2.0};

        // Add the data from the array
        for (Double inputArray1 : inputArray) {
            stats.addValue(inputArray1);
        }
        
        System.out.println("Mean: " + stats.getMean());
        System.out.println("STD: " + stats.getStandardDeviation());
        System.out.println("Median: " + stats.getPercentile(50));
    }
}
