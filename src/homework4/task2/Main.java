package homework4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите имя файла: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.next();

        String fileType = fileName.substring(fileName.indexOf(".")).substring(1).toLowerCase();

        AbstractHandler file;

        switch (fileType){
            case "txt": {
                file = new TXTHandler();
                break;
            }
            case "doc": {
                file = new DOCHandler();
                break;
            }
            case "xml": {
                file = new XMLHandler();
                break;
            }
            default: {
                file = new TXTHandler();
            }
        }

        file.open();
        file.create();
        file.change();
        file.save();
    }
}
