package by.epam.homework.arrays;

import java.util.Arrays;

public class Task20 {

   /* Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
   (освободившиеся элементы заполнить нулям). Дополнительный массив не использовать!*/

   public static void main(String[] args) {
       Task20 task20 = new Task20();
       RandomArrayCreator randomArrayCreator = new RandomArrayCreator();
       int[] arrayWithRandom = randomArrayCreator.createIntArrayAndFillWithRandom(25,100);

       for (int i = 0; i < arrayWithRandom.length; i++) {
           if (i % 2 != 0) {
               arrayWithRandom[i] = 0;
           }
       }

       System.out.println(Arrays.toString(arrayWithRandom));
   }
}
