package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car_2002 = new Car(2002);
        Car car_yellow = new Car("yellow");
        Car car_2020_speed200 = new Car(2020, 200);
        Car car_2019_speed180_weight1300 = new Car(2019, 180, 1300);
        Car car_2010_speed190_weight1500_green = new Car(2010, 190, 1500, "green");

        System.out.println(car);
        System.out.println(car_2002);
        System.out.println(car_yellow);
        System.out.println(car_2020_speed200);
        System.out.println(car_2019_speed180_weight1300);
        System.out.println(car_2010_speed190_weight1500_green);
    }
}
