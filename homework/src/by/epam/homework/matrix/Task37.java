package by.epam.homework.matrix;

/* Переставить строки матрицы случайным образом. */

import java.util.Random;

public class Task37 {

    private MatrixCreator matrixCreator = new MatrixCreator();
    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        Task37 task37 = new Task37();
        int[][] matrix = new int[5][5];
        task37.matrixCreator.fillMatrixWithRandom(10, matrix);
        task37.matrixView.printMatrix(matrix);
        System.out.println();

        task37.shuffleMatrix(matrix);
        task37.matrixView.printMatrix(matrix);
    }

    private void shuffleMatrix (int[][] matrix) {
        for (int j = 0; j < 10; j++){
            int n = new Random().nextInt(matrix.length);
            int k = new Random().nextInt(matrix.length);
            if (k != n) {
                for (int i = 0; i < matrix[n].length; i++) {
                    int temp = matrix[n][i];
                    matrix[n][i] = matrix[k][i];
                    matrix[k][i] = temp;
                }
            }
        }
    }
}
