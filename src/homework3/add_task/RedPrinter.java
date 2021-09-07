package homework3.add_task;

import homework3.ConsoleColors;

public class RedPrinter extends Printer{
    @Override
    public void print(String value) {
        super.print(ConsoleColors.RED + value + ConsoleColors.RESET);
    }
}
