package homework3.task4;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    protected void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
