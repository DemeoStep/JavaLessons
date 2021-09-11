package homework5;

import homework5.task2.Animal;
import homework5.task2.Zoo;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("############# TASK 2 #############");

        Zoo zoo = new Zoo();

        for (int i = 0; i < 8; i++) {
            zoo.add(new Animal());
        }

        System.out.println(zoo);

        System.out.println("\n############# TASK 3 #############");

        //Простой способ
//        zoo.getAnimals().remove(6);
//        zoo.getAnimals().remove(4);
//        zoo.getAnimals().remove(2);

        zoo.remove(3);
        zoo.remove(5);
        zoo.remove(7);

        System.out.println(zoo);

        System.out.println("\n############# TASK 4 #############");

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        final int MAX_RAND = 21;
        final int MIN_RAND = 10;

        for(int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(MAX_RAND - MIN_RAND) + MIN_RAND);
        }

        System.out.println(arrayList);

        int max = 0;
        int min = MAX_RAND;

        for (int item: arrayList) {
            if(item > max) {
                max = item;
            }

            if(item < min) {
                min = item;
            }
        }

        System.out.println("Первый элемент с максимальным значением (" + max + ") находится по индексу " + arrayList.indexOf(max));
        System.out.println("Первый элемент с минимальным значением (" + min + ") находится по индексу " + arrayList.indexOf(min));

        ListIterator<Integer> iterator = arrayList.listIterator();

        while(iterator.hasNext()) {
            iterator.set(iterator.next() + 1);
        }

        System.out.println(arrayList);
    }
}
