package homework10.task4;

import java.util.Arrays;
import java.util.ListIterator;

public class MyArrayList<T> {

    private T[] list = (T[]) new Object[5];
    private int length = 0;

    public void add(T value) {
        grow();
        list[length] = value;
        length++;
    }

    private void grow() {
        if (length == list.length) {
            list = Arrays.copyOf(list, length + length / 2);
        }
    }

    public void add(int index, T value) {
        if (index > length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        grow();

        System.arraycopy(list, index, list, index + 1, length - index);

        list[index] = value;
        length++;
    }

    public void set(int index, T value) {
        if (isEmpty() || index >= length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        list[index] = value;
    }

    public T get(int index) {
        if (isEmpty() || index >= length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return list[index];
    }

    public void remove(int index) {

        if (isEmpty() || index >= length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        System.arraycopy(list, index + 1, list, index, length - 1 - index);

        length--;
    }

    public int indexOf(T value) {

        for (int i = 0; i < length; i++) {
            if (list[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(T value) {

        for (int i = length - 1; i >= 0; i--) {
            if (list[i].equals(value)) {
                return i;
            }
        }

        return -1;
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

    public void trimToSize() {
        list = Arrays.copyOf(list, length);
    }

    public Iter listIterator() {
        return new Iter();
    }

    private class Iter implements ListIterator<T> {
        private int cursor;

        @Override
        public T next() {
            T result = get(cursor);
            if (hasNext()) {
                cursor++;
            }

            return result;
        }

        @Override
        public boolean hasPrevious() {
            return cursor > 0;
        }

        @Override
        public T previous() {
            T result = get(cursor);
            if (hasPrevious()) {
                cursor--;
            }

            return result;
        }

        @Override
        public int nextIndex() {
            if(cursor < length -1) {
                return cursor + 1;
            }
            return -1;
        }

        @Override
        public int previousIndex() {
            if(cursor > 0) {
                return cursor - 1;
            }
            return -1;
        }

        @Override
        public boolean hasNext() {
            return cursor < length;
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(cursor);
        }

        @Override
        public void set(T t) {
            MyArrayList.this.set(cursor, t);
        }

        @Override
        public void add(T t) {
            MyArrayList.this.add(t);
        }
    }

    @Override
    public String toString() {
        String str = "MyArrayList: [";
        for (int i = 0; i < length; i++) {
            str += list[i];
            if (i < length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
