package homework3.task4;

public class DocumentWorker {
    protected void openDocument(){
        System.out.println("Документ открыт");
    }

    protected void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }

    protected void saveDocument(){
        System.out.println("Сохранение документа доступно в версии Про");
    }

    public void printAccessRights() {
        openDocument();
        editDocument();
        saveDocument();
    }
}
