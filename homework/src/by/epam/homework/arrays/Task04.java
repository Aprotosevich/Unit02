package by.epam.homework.arrays;

import java.util.Arrays;

public class Task04 {

   /* Дана последовательность действительных чисел.
   Выяснить будет ли она возрастающей*/

   public static void main(String[] args) {
       Task04 task04 = new Task04();
       RandomArrayCreator randomArrayCreator = new RandomArrayCreator();
       int[] array1 = randomArrayCreator.createIntArrayAndFillWithRandom(3,100);
       int[] array2 = randomArrayCreator.createIntArrayAndFillWithRandom(3,100);
       int[] array3 = randomArrayCreator.createIntArrayAndFillWithRandom(3,100);

       System.out.println(Arrays.toString(array1) + " isIncreasing: " + task04.checkArrayForValidation(array1));
       System.out.println(Arrays.toString(array2) + " isIncreasing: " + task04.checkArrayForValidation(array2));
       System.out.println(Arrays.toString(array3) + " isIncreasing: " + task04.checkArrayForValidation(array3));

   }

   private boolean checkArrayForValidation(int[] array) {
       boolean answer = true;
       for (int i = 0; i < array.length-1; i++){
           if (array[i+1] <= array[i]) {
               answer = false;
           }
       }
       return answer;
   }
}
