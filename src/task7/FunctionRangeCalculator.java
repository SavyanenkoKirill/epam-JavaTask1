package task7;

public class FunctionRangeCalculator {
    public static void calculate(double a, double b, double h) {
        for (double i = a; i < b; i += h) {
            System.out.printf("%-10s|%14f\n",i, Math.pow(Math.sin(i), 2) - Math.cos(2*i));
        }
        if((b-a)%h != 0) {
            System.out.printf("%-10s|%14f\n",b, Math.pow(Math.sin(b), 2) - Math.cos(2*b));
        }
    }
}
