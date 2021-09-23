package homework10.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 20; i++) {
            myArrayList.add(i+1);
        }

        System.out.println(myArrayList);

        myArrayList.remove(2);
        myArrayList.remove(2);
        myArrayList.remove(2);
        myArrayList.remove(2);

        System.out.println(myArrayList);
    }
}

