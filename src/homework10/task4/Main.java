package homework10.task4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArrayList.add(i+1);
        }

        ListIterator<Integer> iterator = myArrayList.listIterator();

        System.out.println(myArrayList);

        for (int i = 0; i < 5; i++) {
            System.out.println(iterator.next());
        }

        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

