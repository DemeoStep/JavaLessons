package homework10.task1;

import java.util.ArrayList;

public class MyDictionary<TKey, TValue> implements IDictionary<TKey, TValue> {

    ArrayList<TKey> keys = new ArrayList<>();
    ArrayList<TValue> values = new ArrayList<>();

    @Override
    public void add(TKey key, TValue value) {
        try {

            if (keys.contains(key)) {
                throw new Exception("Duplicate key {" + key + "}");
            }

            keys.add(key);
            values.add(value);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public TValue getValue(TKey key) {
        return values.get(keys.indexOf(key));
    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public String toString() {
        return "MyDictionary:" +
                "\n\tkeys=" + keys +
                "\n\tvalues=" + values;
    }
}
