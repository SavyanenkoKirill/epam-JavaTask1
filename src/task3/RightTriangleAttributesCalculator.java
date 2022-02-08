package task3;

public class RightTriangleAttributesCalculator {
    public static double calculateSquare(double a, double b) {
        return a * b / 2;
    }

    public static double calculatePerimeter(double a, double b) {
        return a + b + Math.sqrt(a*a + b*b);
    }
}
