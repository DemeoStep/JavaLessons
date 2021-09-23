package homework10.task4;

import Console.ConsoleColor;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] list = (T[]) new Object[5];
    private int length = 0;

    public void add(T value) {
        grow();
        list[length] = value;
        length++;
    }

    private void grow() {
        if(length == list.length - 1) {
            list = Arrays.copyOf(list, length + length/2);
        }
    }

    public void add(int index, T value) {
        if(isEmpty() || index >= length) {
            add(value);
            return;
        }

        T[] arr = Arrays.copyOf(list, length);

        clear();

        if(index < 0) {
            add(value);
        }

        for (int i = 0; i < arr.length; i++) {
            if(i == index) {
                add(value);
            }

            add(arr[i]);
        }
    }

    public void set(int index, T value) {
        try {
            if (index >= length || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }

            list[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ConsoleColor.RED + "Индекс {" + index + "} за пределами массива" + ConsoleColor.RESET);
        }
    }

    public T get(int index) {
        if (isEmpty()) {
            return null;
        }

        T element = null;

        try {
            if (index >= length || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }

            element = list[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ConsoleColor.RED + "Индекс {" + index + "} за пределами массива" + ConsoleColor.RESET);
        }

        return element;
    }

    public void remove(int index) {
        if (isEmpty()) {
            return;
        }

        try {
            if (index >= length || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }

            T[] arr = Arrays.copyOf(list, length);

            clear();

            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    continue;
                }
                add(arr[i]);
            }

            trimToSize();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ConsoleColor.RED + "Индекс {" + index + "} за пределами массива" + ConsoleColor.RESET);
        }

    }

    public int indexOf(T value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(T value) {
        int index = -1;

        for (int i = 0; i < length; i++) {
            if (list[i].equals(value)) {
                index = i;
            }
        }

        return index;
    }

    public int size() {
        return length;
    }

    public void clear() {
        if (isEmpty()) {
            return;
        }

        list = (T[]) new Object[5];
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public T[] toArray(T[] arr) {
        return (T[]) Arrays.copyOf(list, length, arr.getClass());
    }
    
    public void trimToSize(){
        list = Arrays.copyOf(list, length);
    }

    public MyListIterator<T> iterator() {
        return new Iterator();
    }

    private class Iterator implements MyListIterator<T>{
        private int cursor;

        @Override
        public T next() {
            return get(cursor++);
        }

        @Override
        public boolean hasNext() {
            return cursor < length;
        }

        @Override
        public void remove() {
            
        }
    }

    @Override
    public String toString() {
        String str = "MyArrayList: [";
        for (int i = 0; i < length; i++) {
            str += list[i];
            if(i < length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
