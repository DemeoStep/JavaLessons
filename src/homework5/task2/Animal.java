package homework5.task2;

public class Animal {
    private final int id;
    static int counter;

    public Animal() {
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
