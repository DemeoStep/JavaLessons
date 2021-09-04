package homework2.task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 1885;
        this.speed = 16;
        this.weight = 300;
        this.color = "black";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Car(int year) {
        this(year, 0, 0, "undefined");
    }

    public Car(double speed) {
        this(0, speed, 0, "undefined");
    }

    public Car(String color) {
        this(0, 0, 0, color);
    }

    public Car(int year, String color) {
        this(year, 0, 0, color);
    }

    public Car(int year, int speed) {
        this(year, speed, 0, "undefined");
    }

    public Car(int year, double speed, String color) {
        this(year, speed, 0, color);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
