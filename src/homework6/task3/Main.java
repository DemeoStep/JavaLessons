package homework6.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите расстояние в метрах: ");
        Distance.distance = input.nextDouble();

        Distance.Converter.metersToKilometers();
        Distance.print();

        Distance.Converter.kilometersToMiles();
        Distance.print();

        Distance.Converter.milesToKilometers();
        Distance.print();

        Distance.Converter.kilometersToMetres();
        Distance.print();
    }
}
