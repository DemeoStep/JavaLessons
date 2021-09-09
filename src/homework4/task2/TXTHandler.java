package homework4.task2;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Открываю TXT файл");
    }

    @Override
    void create() {
        System.out.println("Создаю TXT файл");
    }

    @Override
    void change() {
        System.out.println("Изменяю TXT файл");
    }

    @Override
    void save() {
        System.out.println("Сохраняю TXT файл");
    }
}
