package by.epam.homework.matrix;

import java.util.Arrays;

public class Task02 {
    /*Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].*/
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int)(Math.random()*9);
            }
        }

        MatrixView matrixView = new MatrixView();
        matrixView.printMatrix(matrix);
    }
}
