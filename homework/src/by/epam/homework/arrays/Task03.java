package by.epam.homework.arrays;

public class Task03 {
   /* Дана последовательность чисел a1 a2 .... an.
   Выяснить какое число встречается раньше положительное или отрицательное.*/
   public static void main(String[] args) {
       RandomArrayCreator randomArrayCreator = new RandomArrayCreator();
       int[] array = randomArrayCreator.createIntArrayAndFillWithRandom(100,100);

       if (array[0] > 0) System.out.println("Положительное");
       else System.out.println("Отрицательное");
   }
}
