package homework2.task3;

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

    public Car(int year) {
        this.year = year;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "undefined";
    }

    public Car(String color) {
        this.year = 0;
        this.speed = 0.0;
        this.weight = 0;
        this.color = color;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 0;
        this.color = "undefined";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "undefined";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
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
