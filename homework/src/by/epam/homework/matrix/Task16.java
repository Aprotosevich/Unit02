package by.epam.homework.matrix;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

public class Task16 {

    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        Task16 task16 = new Task16();
        int n = 6;
        int[][] matrix = new int[n][n];

        task16.modifyMatrixForTask(matrix, n);
        task16.matrixView.printMatrix(matrix);
    }

    private void modifyMatrixForTask(int[][] matrix, int n) {
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][k] =(k + 1)*(k + 2);
            k++;
        }
    }
}
