package by.epam.homework.arrays;

import java.util.Arrays;
import java.util.List;

public class Task17 {

    /*Дана последовательность целых чисел a1 a2 ... an.
    Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a,a2....an) */

    public static void main(String[] args) {
        Task17 task17 = new Task17();
        RandomArrayCreator randomArrayCreator = new RandomArrayCreator();

        int[] array = randomArrayCreator.createIntArrayAndFillWithRandom (5,100);

        int min = Arrays.stream(array).min().getAsInt();

        System.out.println(Arrays.toString(task17.getValidForTaskList(array, min)));
    }

    private int[] getValidForTaskList (int[] array, int min) {
        return Arrays.stream(array)
                .filter(n -> n != min)
                .toArray();
    }
}
