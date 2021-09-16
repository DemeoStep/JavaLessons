package homework3.add_task;

import homework3.ConsoleColor;

public class GreenPrinter extends Printer{
    @Override
    public void print(String value) {
        super.print(ConsoleColor.GREEN + value + ConsoleColor.RESET);
    }
}
