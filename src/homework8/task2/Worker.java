package homework8.task2;

public class Worker {
    private final String fio;
    private final String post;
    private final int year;

    public Worker(String fio, String post, int year) {
        this.fio = fio;
        this.post = post;
        this.year = year;
    }

    public String getFio() {
        return fio;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio +
                "\n\tДолжность: " + post +
                "\n\tГод трудоустройства: " + year +
                "\n---------------------------------";
    }
}
