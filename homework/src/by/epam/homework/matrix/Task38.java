package by.epam.homework.matrix;

/* Найдите сумму двух матриц */

public class Task38 {

    private MatrixCreator matrixCreator = new MatrixCreator();
    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        Task38 task38 = new Task38();

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        task38.matrixCreator.fillMatrixWithRandom(10, matrix1);
        task38.matrixCreator.fillMatrixWithRandom(10, matrix2);

        task38.matrixView.printMatrix(matrix1);
        System.out.println();
        task38.matrixView.printMatrix(matrix2);
        System.out.println();

        task38.matrixView.printMatrix(task38.getMatrixSum(matrix1, matrix2));
    }

    private int[][] getMatrixSum(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = matrix1;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMatrix;
    }
}
