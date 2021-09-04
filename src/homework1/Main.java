package homework1;

import homework1.add_task.Address;
import homework1.task2.Rectangle;
import homework1.task4.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*----------ADDITIONAL TASK---------*/
        System.out.println("/*----------ADDITIONAL TASK---------*/");

        Address address = new Address();
        address.updateAddress();
        address.print();

        System.out.println("/*----------ADDITIONAL TASK---------*/\n\n");

        /*----------TASK 2---------*/
        System.out.println("/*----------TASK 2---------*/");

        System.out.print("Введите длину прямоугольника: ");
        double side1 = input.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double side2 = input.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);
        rectangle.printRectangle();

        System.out.println("/*----------TASK 2---------*/\n\n");

        /*----------TASK 4---------*/
        System.out.println("/*----------TASK 4---------*/");

        Computer[] Computers = new Computer[5];

        for (int i = 0; i < Computers.length; i++) {
            Computers[i] = new Computer();
        }

        // Убедимся, что массив содержит объекты
        for (Computer computer : Computers) {
            System.out.println(computer);
        }

        System.out.println("/*----------TASK 4---------*/");

    }
}
