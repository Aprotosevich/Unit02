package by.epam.homework.matrix;

import java.util.Arrays;

public class Task04 {
   /* Дана матрица. Вывести на экран первую и последнюю строки.*/
   public static void main(String[] args) {
       MatrixView matrixView = new MatrixView();
       MatrixCreator randomMatrixCreator = new MatrixCreator();

       int[][] matrix = randomMatrixCreator.getRandomMatrix();
       randomMatrixCreator.fillMatrixWithRandom(10, matrix);
       matrixView.printMatrix(matrix);

       System.out.println("First line: " + Arrays.toString(matrix[0]));
       System.out.println("Last line: " + Arrays.toString(matrix[matrix.length-1]));
   }
}
