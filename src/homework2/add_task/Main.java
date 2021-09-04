package homework2.add_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите радиус: ");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();

        MyArea.areaOfCircle(radius);
    }
}