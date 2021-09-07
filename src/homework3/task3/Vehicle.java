package homework3.task3;

public class Vehicle {
    protected double longitude;
    protected double latitude;
    protected int price;
    protected int speed;
    protected int year;

    protected Vehicle(double longitude, double latitude, int price, int speed, int year) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
}
