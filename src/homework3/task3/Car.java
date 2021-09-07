package homework3.task3;

public class Car extends Vehicle{

    public Car(double longitude, double latitude, int price, int speed, int year) {
        super(longitude, latitude, price, speed, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
