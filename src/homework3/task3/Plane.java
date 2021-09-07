package homework3.task3;

public class Plane extends Vehicle{
    private double height;
    private double passengers;

    public Plane(double longitude, double latitude, int price, int speed, int year, double height, double passengers) {
        super(longitude, latitude, price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passengers=" + passengers +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
