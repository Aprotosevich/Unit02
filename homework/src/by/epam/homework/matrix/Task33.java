package by.epam.homework.matrix;

/* Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
*  Сделано по убыванию, на возрастание делается аналогично меняя только знаки */

public class Task33 {

    private MatrixCreator matrixCreator = new MatrixCreator();
    private MatrixView matrixView = new MatrixView();


    public static void main(String[] args) {
        Task33 task33 = new Task33();
        int[][] matrix = new int[7][7];
        task33.matrixCreator.fillMatrixWithRandom(10, matrix);
        task33.matrixView.printMatrix(matrix);
        System.out.println();

        task33.sortMatrixColumns(matrix);

        task33.matrixView.printMatrix(matrix);
    }

    private void sortMatrixColumns(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            sortOneColumn(matrix, i);
        }
    }

    private void sortOneColumn(int[][] matrix, int n) {
        boolean needMoreCheck;
        do {
            sortColumnOneTime(matrix, n);
            needMoreCheck = isColumnSorted(matrix, n);
        } while (needMoreCheck);
    }

    private boolean isColumnSorted(int[][] matrix, int n) {
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i - 1][n] < matrix[i][n]) {
                return true;
            }
        }
        return false;
    }

    private void sortColumnOneTime(int[][] matrix, int n) {
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i-1][n] < matrix[i][n]) {
                int tmp = matrix[i-1][0];
                matrix[i-1][n] = matrix[i][n];
                matrix[i][n] = tmp;
            }
        }
    }
}
