package by.epam.homework.matrix;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
        в каждом столбце число единиц равно номеру столбца.*/

import java.util.Arrays;

public class Task34 {

    private MatrixView matrixView = new MatrixView();
    private MatrixCreator matrixCreator = new MatrixCreator();

    public static void main(String[] args) {
        Task34 task34 = new Task34();
        int[][] randomMatrix = task34.matrixCreator.getRandomMatrix();

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = i+1; j < randomMatrix[i].length; j++) { // нумерацию столбца учитываю с 0
                        randomMatrix[i][j] = 1;
            }
        }

        task34.matrixView.printMatrix(randomMatrix);
    }

}
