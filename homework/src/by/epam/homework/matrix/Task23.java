package by.epam.homework.matrix;

/*Сформировать квадратную матрицу порядка N по правилу:
        и подсчитать количество положительных элементов в ней*/

public class Task23 {
    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        Task23 task23 = new Task23();
        int a = 5;
        int n = 8;

        double[][] matrix = task23.getValidMatrix(n, a);
        task23.matrixView.printDoubleMatrix(matrix);
    }

    private double[][] getValidMatrix(int n, int a) {
        double[][] matrix = new double[a][a];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((double) (i*i - j*j)) / (double) n;
            }
        }
        return matrix;
    }
}
