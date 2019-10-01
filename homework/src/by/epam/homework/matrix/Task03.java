package by.epam.homework.matrix;

public class Task03 {
    /*Дана матрица. Вывести на экран первый и последний столбцы.*/
    public static void main(String[] args) {
        MatrixView matrixView = new MatrixView();
        MatrixCreator randomMatrixCreator = new MatrixCreator();

        int[][] matrix = randomMatrixCreator.getRandomMatrix();
        randomMatrixCreator.fillMatrixWithRandom(10, matrix);
        matrixView.printMatrix(matrix);

        System.out.print("First column: ");
        matrixView.printColumn(0, matrix);
        System.out.print("Last column: ");
        matrixView.printColumn(matrix[0].length-1,matrix);
    }
}
