package homework10.task4;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArrayList.add(i+1);
        }

        MyListIterator<Integer> iterator = myArrayList.iterator();

        System.out.println(myArrayList);

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.removeIt();
        iterator.removeIt();

        System.out.println(myArrayList);
    }
}

