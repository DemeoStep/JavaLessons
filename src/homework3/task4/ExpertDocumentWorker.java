package homework3.task4;

public class ExpertDocumentWorker extends DocumentWorker{
    @Override
    protected void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
