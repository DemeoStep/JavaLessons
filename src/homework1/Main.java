package homework1;

import homework1.add_task.Address;
import homework1.task2.Rectangle;
import homework1.task4.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*----------ADDITIONAL TASK---------*/
        Address address = new Address();

        /*----------TASK 2---------*/
        System.out.println("/*----------TASK 2---------*/");

        System.out.print("Введите длину прямоугольника: ");
        double side1 = input.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double side2 = input.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);
        rectangle.printRectangle();

        System.out.println("/*----------TASK 2---------*/\n\n");

        /*----------TASK 3---------*/
        Computer computer = new Computer();
    }
}
