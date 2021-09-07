package homework3.task2;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Учится плохо");
    }

    @Override
    public void read() {
        System.out.println("Читает медленно и невнимательно");
    }

    @Override
    public void write() {
        System.out.println("Пишет со многими ошибками");
    }

    @Override
    public void relax(){
        System.out.println("Постоянно на расслабоне");
    }
}
