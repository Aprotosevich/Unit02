package by.epam.homework.matrix;

import java.util.ArrayList;
import java.util.List;

/* Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. */

public class Task09 {
    private MatrixCreator matrixCreator = new MatrixCreator();
    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        Task09 task09 = new Task09();
        int[][] matrix = new int[6][6];
        task09.matrixCreator.fillMatrixWithRandom(10,matrix);
        task09.matrixView.printMatrix(matrix);

        System.out.println("Answer: " + task09.getListDiagonalNumbers(matrix));
    }

    public List<Integer> getListDiagonalNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            list.add(matrix[i][k]);
            k++;
        }
        return list;
    }
}
