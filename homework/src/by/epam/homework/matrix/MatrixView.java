package by.epam.homework.matrix;

public class MatrixView {

    public void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void printColumn ( int n, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(" " + matrix[i][n] + " ");
        }
        System.out.println();
    }

    public void printDoubleMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


