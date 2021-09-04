package homework2.add_task;

public class MyArea {
    final static double PI = 3.14;

    public static void areaOfCircle (double radius) {
        double square = PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + square);
    }
}
