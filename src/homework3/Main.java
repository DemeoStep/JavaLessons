package homework3;

import homework3.add_task.Printer;
import homework3.task2.*;
import homework3.task3.Car;
import homework3.task3.Plane;
import homework3.task3.Ship;
import homework3.task3.Vehicle;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.startTask2();
        main.startTask3();
        main.startTask4();
        main.startAddTask();
    }

    void startTask2() {
        Pupil pupil_1 = new BadPupil();
        Pupil pupil_2 = new GoodPupil();
        Pupil pupil_3 = new ExcelentPupil();
        Pupil pupil_4 = new BadPupil();

        ClassRoom room = new ClassRoom(pupil_1, pupil_2, pupil_3, pupil_4);
        room.printClassRoom();
    }

    void startTask3() {
        Car car = new Car(32.2342355, 12.998324867, 10000, 280, 2020);
        Plane plane = new Plane(33.87512432, 18.230897123, 2000000, 1000, 2000, 7000, 64);
        Ship ship = new Ship(12.876324234, 10.9238481237542, 1000000, 60, 1999, 500, "Odessa");

        System.out.println(car);
        System.out.println(plane);
        System.out.println(ship);
    }

    void startTask4() {

    }

    void startAddTask() {
        Printer printer = new Printer();
    }
}
