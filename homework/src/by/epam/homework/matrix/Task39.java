package by.epam.homework.matrix;

public class Task39 {
    private MatrixView matrixView = new MatrixView();
    private MatrixCreator matrixCreator = new MatrixCreator();

    public static void main(String[] args) throws Exception {
        Task39 task39 = new Task39();

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][3];
/*        matrix1[0][0] = 2;
        matrix1[0][1] = -1;
        matrix1[1][0] = 5;
        matrix1[1][1] = 3;
        matrix2[0][0] = 3;
        matrix2[0][1] = 1;
        matrix2[0][2] = 0;
        matrix2[1][0] = 2;
        matrix2[1][1] = -1;
        matrix2[1][2] = 5;   test if correct */

        task39.matrixCreator.fillMatrixWithRandom(7,matrix1);
        task39.matrixCreator.fillMatrixWithRandom(7,matrix2);
        task39.matrixView.printMatrix(matrix1);
        System.out.println();
        task39.matrixView.printMatrix(matrix2);
        System.out.println();

        int[][] multiArray = task39.getMatrixMultiply(matrix1, matrix2);
        task39.matrixView.printMatrix(multiArray);
    }

    private int[][] getMatrixMultiply (int[][] matrix1, int[][] matrix2) throws Exception{
        if(matrix1[0].length != matrix2.length){
            throw new Exception ("Cannot multiply matrix!");
        }
        int[][] answerArray = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                answerArray[i][j] = 0;
                for (int k = 0; k < matrix1[i].length; k++) {
                    answerArray[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return answerArray;
    }
}
