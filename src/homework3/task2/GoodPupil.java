package homework3.task2;

public class GoodPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Учится хорошо");
    }

    @Override
    public void read() {
        System.out.println("Читает уверенно");
    }

    @Override
    public void write() {
        System.out.println("Пишет с незначительными ошибками");
    }

    @Override
    public void relax(){
        System.out.println("Отдыхает дома");
    }
}
