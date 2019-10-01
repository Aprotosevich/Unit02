package by.epam.homework.matrix;

import java.util.Arrays;

public class Task01 {
   /* Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
   была ровно одна единица, и вывести на экран.*/
   public static void main(String[] args) {
       int[][] matrix = {{0,0,0,1}, {0,0,0,1}, {0,0,0,1}};

       MatrixView matrixView = new MatrixView();
       matrixView.printMatrix(matrix);
   }
}
