package homework3.task2;

import java.util.Arrays;

public class ClassRoom {
    Pupil[] classRoom = new Pupil[4];

    public ClassRoom(Pupil pupil_1, Pupil pupil_2, Pupil pupil_3, Pupil pupil_4) {
        classRoom[0] = pupil_1;
        classRoom[1] = pupil_2;
        classRoom[2] = pupil_3;
        classRoom[3] = pupil_4;
    }

    public void printClassRoom() {
        var pupilNum = 1;
        for (Pupil pupil: classRoom) {
            System.out.println("-----------------------");
            System.out.println("Ученик " + pupilNum + ":");
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.print("Итог: ");
            pupil.study();
            System.out.println("-----------------------\n");
            pupilNum++;
        }
    }
}
