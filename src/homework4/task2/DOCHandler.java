package homework4.task2;

public class DOCHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Открываю DOC файл");
    }

    @Override
    void create() {
        System.out.println("Создаю DOC файл");
    }

    @Override
    void change() {
        System.out.println("Изменяю DOC файл");
    }

    @Override
    void save() {
        System.out.println("Сохраняю DOC файл");
    }
}
