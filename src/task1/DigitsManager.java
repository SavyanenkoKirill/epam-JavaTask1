package task1;

public class DigitsManager {
    public static void manage(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++){
            digits[i] = num % 10;
            num /= 10;
        }
        System.out.println(digits[0] + digits[1] == digits[2] + digits[3]);
    }
}
