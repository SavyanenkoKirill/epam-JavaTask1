package task2;

public class ExpressionCalculator {
    public static double calculate(double a, double b, double c) {
        double expr = b*b + 4*a*c;
        if (expr < 0) throw new ArithmeticException();
        return (b + Math.sqrt(expr)) / (2*a) - Math.pow(a,3)*c + Math.pow(b,-2);
    }
}
