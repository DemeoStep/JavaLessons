package homework10.task4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArrayList.add(i+1);
        }

        ListIterator<Integer> iterator = myArrayList.listIterator();

        iterator.remove();

        System.out.println(myArrayList);
    }
}

