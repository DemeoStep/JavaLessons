package homework2.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car_2002 = new Car(2002);
        Car car_green = new Car("green");

        Car car_2020_red = new Car(2020, "red");

        System.out.println(car);
        System.out.println(car_2002);
        System.out.println(car_green);
        System.out.println(car_2020_red);
    }
}