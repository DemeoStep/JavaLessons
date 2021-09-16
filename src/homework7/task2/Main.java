package homework7.task2;

import Console.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println(ConsoleColors.RED.color + error + ConsoleColors.RESET.color);
            }
        };

        errorPrinter.printError("ERROR!");
    }
}
