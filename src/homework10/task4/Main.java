package homework10.task4;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArrayList.add(i+1);
        }

        Iterator<Integer> iterator = myArrayList.iterator();

        iterator.remove();

        System.out.println(myArrayList);
    }
}

