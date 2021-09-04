package homework2.task2;

public class Car {
    private int year;
    private String color;

    public Car() {
        this.year = 1885;
        this.color = "black";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
