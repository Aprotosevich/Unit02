package by.epam.homework.matrix;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/
public class Task20 {
    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = new int[n][n];
        Task20 task20 = new Task20();

        task20.modifyMatrix(matrix);
        task20.matrixView.printMatrix(matrix);
    }

    private void modifyMatrix(int[][] matrix) {
        int k = 1;
        while (k <= (matrix.length / 2)) {
            fillFirstHalfFromBegin(matrix, k);
            fillFirstHalfFromEnd(matrix, k);
            fillLastHalfFromBegin(matrix, k);
            fillLastHalfFromEnd(matrix, k);
            k++;
        }
    }

    private void fillFirstHalfFromBegin(int[][] matrix, int k) {
        for (int i = k-1; i < matrix.length/2; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    private void fillLastHalfFromBegin(int[][] matrix, int k) {
        for (int i = matrix.length-k; i >= matrix.length/2; i--) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    private void fillFirstHalfFromEnd(int[][] matrix, int k) {
        int d = (matrix.length -1) - k;
        for (int i = k-1; i < matrix.length/2; i++) {
            for (int j = matrix.length-1; j > d; j--) {
                matrix[i][j] = 1;
            }
        }
    }

    private void fillLastHalfFromEnd(int[][] matrix, int k) {
        int d = (matrix.length -1) - k;
        for(int i = matrix.length-k; i >= matrix.length/2; i--) {
            for (int j = matrix.length-1; j > d; j--) {
                matrix[i][j] = 1;
            }
        }
    }

}
