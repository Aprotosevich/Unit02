package by.epam.homework.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*  Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из
         чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух
         больших диагоналей равны между собой. Построить такой квадрат. */

public class Task40 {

    private Task09 task09 = new Task09();
    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        Task40 task40 = new Task40();
        int n = 7;
        int[][] matrix = new int[n][n];

        task40.fillMatrixWithCorrectNum(matrix, n);
        task40.matrixView.printMatrix(matrix);

        System.out.println(task40.isMatrixValidForTask(matrix));
    }

    private void fillMatrixWithCorrectNum(int[][] matrix, int n) {
        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n)
                    j = 0;
                if (i < 0)
                    i = n - 1;
            }
            if (matrix[i][j] != 0) {
                j -= 2;
                i++;
            } else {
                matrix[i][j] = num++;
                j++;
                i--;
            }
        }
    }


    private boolean isMatrixValidForTask (int[][] matrix) {
        List<Integer> listSums = getSumsList(matrix);
        System.out.println("Sums: " + listSums);
        boolean isValid = true;

        for (int i = 1; i < listSums.size(); i++) {
            if(!listSums.get(i).equals(listSums.get(i - 1))) {
                isValid = false;
            }
        }

        return isValid;
    }

    private List<Integer> getSumsList(int[][] matrix) {
        List<Integer> listSums = new ArrayList<>();
        // суммы строк
        for (int i = 0; i < matrix.length; i++) {
            listSums.add(Arrays.stream(matrix[i]).sum());
        }
        //суммы столбцов
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            listSums.add(sum);
        }
        //суммы диагоналей
        int sumDiagonal = task09.getListDiagonalNumbers(matrix).stream().mapToInt(n -> n).sum();
        listSums.add(sumDiagonal);
        int sumAnotherDiagonal = getListAnotherDiagonalNumber(matrix).stream().mapToInt(n -> n).sum();
        listSums.add(sumAnotherDiagonal);

        return listSums;
    }

    private List<Integer> getListAnotherDiagonalNumber(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int k = matrix[0].length-1;
        for (int i = 0; i < matrix.length; i++) {
            list.add(matrix[i][k]);
            k--;
        }
        return list;
    }
}

/*In any magic square, the first number i.e. 1 is stored at position (n/2, n-1). Let this position be (i,j). The next
number is stored at position (i-1, j+1) where we can consider each row & column as circular array i.e. they wrap around.
Three conditions hold:
 1. The position of next number is calculated by decrementing row number of previous number by 1, and incrementing the
 column number of previous number by 1. At any time, if the calculated row position becomes -1, it will wrap around
 to n-1. Similarly, if the calculated column position becomes n, it will wrap around to 0.
 2. If the magic square already contains a number at the calculated position, calculated column position will be
 decremented by 2, and calculated row position will be incremented by 1.
 3. If the calculated row position is -1 & calculated column position is n, the new position would be: (0, n-2).*/