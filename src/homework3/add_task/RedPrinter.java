package homework3.add_task;

import homework3.ConsoleColor;

public class RedPrinter extends Printer{
    @Override
    public void print(String value) {
        super.print(ConsoleColor.RED + value + ConsoleColor.RESET);
    }
}
