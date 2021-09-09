package homework4.task2;

public class XMLHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Открываю XML файл");
    }

    @Override
    void create() {
        System.out.println("Создаю XML файл");
    }

    @Override
    void change() {
        System.out.println("Изменяю XML файл");
    }

    @Override
    void save() {
        System.out.println("Сохраняю XML файл");
    }
}
