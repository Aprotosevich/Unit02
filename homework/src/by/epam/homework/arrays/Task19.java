package by.epam.homework.arrays;

import java.util.*;

public class Task19 {

    /* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    Если таких чисел несколько, то определить наименьшее из них*/

    public static void main(String[] args) {
        Task19 task19 = new Task19();
        RandomArrayCreator randomArrayCreator = new RandomArrayCreator();
        int[] array = randomArrayCreator.createIntArrayAndFillWithRandom(35,100);

        System.out.println("Array: " + Arrays.toString(array));
        task19.printResults(task19.findMinCountValues(array));
    }

    private Set<Integer> findMinCountValues (int[] array) {
        Set<Integer> answerSet = new HashSet<>();

        int counterMaxOften = 1;
        for( int i = 0; i < array.length; i++) {
            int countI = countHowMuchInArray(array[i], array);
            if( counterMaxOften < countI) {
                counterMaxOften = countI;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if ( counterMaxOften == countHowMuchInArray(i, array)) {
                answerSet.add(array[i]);
            }
        }

        return answerSet;
    }

    private int countHowMuchInArray (int value, int[] array) {
        return (int)Arrays.stream(array).count();
    }

    private void printResults(Set<Integer> set) {
        if(set.size() == 1) {
            System.out.println("Answer: " + set);
        }
        else {
            System.out.println("Answer: " + set.stream()
                    .mapToInt(n -> n)
                    .min()
                    .getAsInt());
        }
    }
}
