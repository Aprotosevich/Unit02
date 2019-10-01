package by.epam.homework.matrix;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/
public class Task18 {

    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        int n = 6;
        int[][] matrix = new int[n][n];
        Task18 task18 = new Task18();

        task18.modifyMatrixForTask(matrix,n);
        task18.matrixView.printMatrix(matrix);
    }

    private void modifyMatrixForTask(int[][] matrix, int n) {
        int k =1;
        while(k <= n) {
            for (int i = 0; i <= matrix.length - k; i++) {
                matrix[k-1][i] = k;
            }
            k++;
        }
    }
}
