package task4;

public class PointLocationIdentifier {
    public static void identify(double x, double y) {
        System.out.println(y > 0 && x < 2 && x > -2 || y < 0 && x < 4 && x > -4);
    }
}
