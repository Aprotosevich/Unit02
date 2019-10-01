package by.epam.homework.matrix;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
    private MatrixCreator matrixCreator = new MatrixCreator();
    private MatrixView matrixView = new MatrixView();

    /*Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.*/

    public static void main(String[] args) {
        Task07 task07 = new Task07();
        int[][] matrix = new int[5][5];
        task07.matrixCreator.fillMatrixRandomInclNegative(10, matrix);
        task07.matrixView.printMatrix(matrix);

        System.out.println("Sum: " + task07.getPowSumFromList
                (task07.getNegativeOddElements(matrix)));
    }

    private List<Integer> getNegativeOddElements(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int element = matrix[i][j];
                if (element < 0 && element % 2 != 0) {
                    list.add(element);
                }
            }
        }

        return list;
    }

    private int getPowSumFromList (List<Integer> list) {
        return list.stream()
                .mapToInt(n -> Math.abs(n))
                .sum();
    }
}
