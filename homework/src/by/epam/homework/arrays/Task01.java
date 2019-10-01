package by.epam.homework.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task01 {
    //В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.
    public static void main(String[] args) {
        Task01 task01 = new Task01();
        int n = 500;
        int k = 25;

        int[] taskArray = task01.createArray(n);

        int getValidSum = task01.getSumFromArray(
                task01.getValidElementArray(taskArray, k));

        System.out.println("Sum : " + getValidSum);
    }

    private int getSumFromArray (int[] array) {
        return Arrays.stream(array).sum();
    }

    private int[] getValidElementArray(int[] array, int k){
        return Arrays.stream(array).
                filter(n -> n % k == 0).
                toArray();
    }

    private int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

}
