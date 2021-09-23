package homework10.task1;

public interface IDictionary<TKey, TValue>{
    void add(TKey key, TValue value);
    TValue getValue(TKey key);
    int size();
}

