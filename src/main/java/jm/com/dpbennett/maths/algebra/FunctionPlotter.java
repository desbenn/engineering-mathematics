/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.com.dpbennett.maths.algebra;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.function.Function2D;
import org.jfree.data.general.DatasetUtils;
import org.jfree.data.xy.XYDataset;

public class FunctionPlotter {
    public static void main(String[] args) {
        
        // Define the function to plot
        Function2D function = new Function2D() {
            
            @Override
            public double getValue(double x) {
                // Replace this with your own function
                return Math.sin(x);
            }
            
        };
        
        // Create the dataset
        XYDataset dataset = DatasetUtils.sampleFunction2D(function, -10.0, 10.0, 100, "Function");
        
        // Create the chart
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Function Plot", // Chart title
                "X", // X-axis label
                "Y", // Y-axis label
                dataset // Dataset
        );
        
        // Display the chart in a frame
        ChartFrame frame = new ChartFrame("Function Plot", chart);
        frame.pack();
        frame.setVisible(true);
    }
}

