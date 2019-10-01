package by.epam.homework.arrays;

public class RandomArrayCreator {
    public int[] createIntArrayAndFillWithRandom(int number, int fromZeroTill){
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()* fromZeroTill);
        }
        return array;
    }
}
