package by.epam.homework.matrix;

public class MatrixCreator {
    public int[][] getRandomMatrix () {
        int n = (int)(Math.random()*5+2); // magic number to make matrix min 3 line
        int m = (int)(Math.random()*5+1); // magic number to have min 2 column
        return new int[n][m];
    }

    public void fillMatrixWithRandom (int fromZeroTill, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*fromZeroTill);
            }
        }
    }

    public void fillMatrixWithRandomExclZero (int fromOneTill, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*fromOneTill + 1);
            }
        }
    }

    public void fillMatrixRandomInclNegative (int fromZeroTill, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int roll = (int)(Math.random() * 4);
                matrix[i][j] = (int)(Math.random()*fromZeroTill);
                if(roll == 2) {
                    matrix[i][j] = - (int)(Math.random()*fromZeroTill);
                }
            }
        }
    }
}
