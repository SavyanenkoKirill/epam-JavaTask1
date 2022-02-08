package task8;

public class MultiplesSumCalculator {
    public static int calculate(int[] arr, int k) {
        int sum = 0;
        for (int j : arr) {
            if (k % j == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
