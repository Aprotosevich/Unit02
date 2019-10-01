package by.epam.homework.matrix;

/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        пользователь с клавиатуры. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {

    private MatrixCreator matrixCreator = new MatrixCreator();

    private MatrixView matrixView = new MatrixView();

    public static void main(String[] args) {
        Task27 task27 = new Task27();
        int[][] matrix = new int[6][8];
        task27.matrixCreator.fillMatrixWithRandom(10, matrix);
        task27.matrixView.printMatrix(matrix);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите какие столбцы поменять местами? Введите номера");

        int a = task27.validateAndEnterNumber(bufferedReader);
        int b = task27.validateAndEnterNumber(bufferedReader);

        task27.switchColumnsInMatrix(a, b, matrix);
        System.out.println("New matrix after switch: ");
        task27.matrixView.printMatrix(matrix);
    }

    private void switchColumnsInMatrix(int a, int b, int[][] matrix) {
        a--;
        b--; // т.к. исчисление массива идет от 0, а пользователь интуитивно первую колонку назовет "1";
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] = temp;
        }
    }

    private int validateAndEnterNumber (BufferedReader reader) {
        int x = 0;
        try {
            while(true) {
                String regEx = "\\d+";
                Pattern pattern = Pattern.compile(regEx);
                String input = reader.readLine();
                Matcher matcher = pattern.matcher(input);
                if(matcher.matches()){
                    System.out.println("Succes!");
                    x = Integer.parseInt(input);
                    break;
                }
                System.out.println("Error! Try again!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return x;
    }
}
