package task6;

public class MaxMinSumCalculator {
    public static double calculate(double a, double b, double c) {
        double max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        double min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        //double min = a < b ? (Math.min(a, c)) : (Math.min(b, c));
        //double max = a > b ? (Math.max(a, c)) : (Math.max(b, c));
        return max + min;
    }
}
