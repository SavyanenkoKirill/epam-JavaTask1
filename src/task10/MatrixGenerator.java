package task10;

public class MatrixGenerator {
    public static int[][] generate(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i % 2 == 0 ? n-j : j+1;
            }
        }
        return matrix;
    }
}
