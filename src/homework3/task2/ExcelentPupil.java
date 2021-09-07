package homework3.task2;

public class ExcelentPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Учится отлично");
    }

    @Override
    public void read() {
        System.out.println("Читает быстро и внимательно");
    }

    @Override
    public void write() {
        System.out.println("Пишет без ошибок");
    }

    @Override
    public void relax(){
        System.out.println("Правильно распределяет время между учебой и отдыхом");
    }
}
