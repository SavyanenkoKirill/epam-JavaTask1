package task9;

public class ArraysManipulator {
    public static int[] manipulate(int[] arr1, int[] arr2, int k) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < k; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = k; i < k + arr2.length; i++) {
            arr3[i] = arr2[i-k];
        }
        for (int i = k + arr2.length; i < k + arr2.length + arr1.length - 2; i++) {
            arr3[i] = arr1[i-arr2.length];
        }
        return arr3;
    }
}
