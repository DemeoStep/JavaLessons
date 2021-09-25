package homework10.task4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArrayList.add(i+1);
        }

        ListIterator<Integer> iterator = myArrayList.listIterator();

        iterator.add(11);
        iterator.next();
        iterator.next();

        System.out.println(iterator.nextIndex());
        System.out.println(iterator.previousIndex());

        System.out.println(myArrayList);
    }
}

