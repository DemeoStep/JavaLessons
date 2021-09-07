package homework3.task3;

public class Ship extends Vehicle{
    private int passengers;
    private String home;

    public Ship(double longitude, double latitude, int price, int speed, int year, int passengers, String home) {
        super(longitude, latitude, price, speed, year);
        this.passengers = passengers;
        this.home = home;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengers=" + passengers +
                ", home='" + home + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
