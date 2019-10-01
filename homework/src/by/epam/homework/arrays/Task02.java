package by.epam.homework.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task02 {
    // В целочисленной последовательности есть нулевые элементы. Создать массив
    // из номеров этих элементов (нумерацию я начал с единицы.)
    public static void main(String[] args) {
        Task02 task02 = new Task02();
        List<Integer> taskList = task02.createValidList();

        int[] array = task02.getValidArrayFromList(taskList);

        System.out.println(taskList);
        System.out.println(Arrays.toString(array));
    }

    private int[] getValidArrayFromList(List<Integer> list){
        int countZero = (int)list.stream()
                .filter(n -> n == 0)
                .count();
        int[] array = new int[countZero];

        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0){
                array[k] = i+1;
                k++;
            }
        }

        return array;
    }

    private List<Integer> createValidList(){
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int randomElement = (int)(Math.random()*100);
            answerList.add(randomElement);
            if(randomElement % 3 == 0){
                answerList.add(0); // random add '0' in List
            }
        }
        return answerList;
    }

}
