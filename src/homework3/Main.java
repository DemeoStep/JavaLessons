package homework3;

import homework3.add_task.Printer;
import homework3.task2.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.startTask2();
        main.startTask3();
        main.startTask4();
        main.startAddTask();
    }

    void startTask2() {
        Printer printer = new Printer();
    }

    void startTask3() {
        Pupil pupil_1 = new BadPupil();
        Pupil pupil_2 = new GoodPupil();
        Pupil pupil_3 = new ExcelentPupil();
        Pupil pupil_4 = new BadPupil();

        ClassRoom room = new ClassRoom(pupil_1, pupil_2, pupil_3, pupil_4);
        room.printClassRoom();
    }

    void startTask4() {

    }

    void startAddTask() {
    }
}
