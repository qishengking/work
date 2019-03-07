package fristchapter;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {
    private Average() { }

    /**
     * Reads in a sequence of real numbers from standard input and prints
     * out their average to standard output.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int count = 0;       // number input values
        double sum = 0.0;    // sum of input values
        String a = "sdf";

        // read data and compute statistics
//        while (!StdIn.isEmpty()) {
//            double value = StdIn.readDouble();
//            sum += value;
//            count++;
//        }

        // compute the average
//        double average = sum / count;
        double average = 10;

        // print results
        StdOut.println("Average is " + average);
    }
}
