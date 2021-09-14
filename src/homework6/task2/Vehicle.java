package homework6.task2;

public class Vehicle {

    private static class Wheel{
        static String color = "silver";
    }

    private static class Door{
        static String color = "red";
    }

    public void printWheelColor() {
        System.out.println("The color of wheels is " + Wheel.color);
    }

    public void printDoorColor() {
        System.out.println("The color of doors is " + Door.color);
    }


}
