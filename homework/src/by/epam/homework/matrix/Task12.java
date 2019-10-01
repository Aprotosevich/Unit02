package by.epam.homework.matrix;

/* Получить квадратную матрицу порядка n:*/
public class Task12 {
   private MatrixView matrixView = new MatrixView();

   public static void main(String[] args) {
       int n = 6;
       Task12 task12 = new Task12();
       int[][] matrix = new int[n][n];

       task12.modifyMatrix(matrix);
       task12.matrixView.printMatrix(matrix);
   }

   private void modifyMatrix(int[][] matrix) {
      int k = 0;
      for (int i = 0; i < matrix.length; i++) {
         matrix[i][k] = k;
         k++;
      }
   }
}
