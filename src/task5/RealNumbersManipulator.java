package task5;

public class RealNumbersManipulator {
    public static void manipulate(double a, double b, double c) {
        a = a > 0 ? a*a : Math.pow(a,4);
        b = b > 0 ? b*b : Math.pow(b,4);
        c = c > 0 ? c*c : Math.pow(c,4);
        System.out.println(a + " " + b + " " + c);
    }
}
