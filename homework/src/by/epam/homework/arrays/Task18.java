package by.epam.homework.arrays;

import java.util.ArrayList;
import java.util.List;

/* Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек, в которые надо вставить игральные кубики.
 * Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях
 * кубиков равна 10. (Кубик имеет на каждой грани от 1 до 6 точек) Напишите программу, которая разгадывает код замка
 * при условии, что два кубика уже вставлены в ячейки. */

public class Task18 {

   public static void main(String[] args) {
       Lock lock = new Lock();

       lock.hackLock();
   }

   /* Создан класс Lock, который содержит лист элементов кубиков и булевое значение открыт или закрыт. Подбор замка
   * я сделал через roll, то есть бросок кубика (не устанавливая заранее нужное значение). Thread.sleep добавил в метод
   * подбора для более красивого вывода.
   * В конструкторе автоматически бросается два кубика при создании. hacklock вызывает метод tryToOpen, который бросает
   * следующий кубик, пока не будет соблюдено требуемое условие суммы.
   * */

   private static class Lock {
       private List<Cube> cubes = new ArrayList<>(10);
       private boolean isOpen = false;

       Lock(){
           Cube cube1 = new Cube();
           Cube cube2 = new Cube();
           while(cube1.points + cube2.points <= 3 || cube1.points + cube2.points >= 10) {
               cube1.roll();
               cube2.roll();
           }
           cubes.add(0,cube1);
           cubes.add(1,cube2);
           printLock();
       }

       private void hackLock () {
           while(cubes.size() != 10) {
               tryToOpen();
           }
           printLock();
       }

       public void printLock() {
           System.out.print("Lock is: ");
           cubes.stream().forEach(System.out::print);
           System.out.println("\nIt is: " + isOpenOrLocked());
       }

       private String isOpenOrLocked () {
           if (isOpen) {
               return "Opened";
           }
           else return "Closed";
       }

       private boolean checkIfOpen() {
           if(cubes.size() != 10) {
               return false;
           }
           for (int i = 2; i < cubes.size(); i++) {
               if (cubes.get(i).points + cubes.get(i-1).points + cubes.get(i-2).points != 10) {
                   return false;
               }
           }
           return true;
       }



       private void tryToOpen() {
           try {
               Cube newCube = new Cube();
               cubes.add(cubes.size(), newCube);
               printLock();
               while (cubes.get(cubes.size()-2).points
                       + cubes.get(cubes.size()-3).points
                       + newCube.points != 10) {
                   newCube.roll();
                   cubes.set(cubes.size()-1, newCube);
                   printLock();
                   Thread.sleep(250);
               }
               isOpen = checkIfOpen();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }

   private static class Cube {
       int points;

       void roll() {
           points = (int)((Math.random()*6)+1);
       }

       @Override
       public String toString() {
           return points+" ";
       }

       Cube () {
           this.roll();
       }
   }
}
