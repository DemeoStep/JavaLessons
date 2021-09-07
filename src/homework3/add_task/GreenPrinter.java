package homework3.add_task;

import homework3.ConsoleColors;

public class GreenPrinter extends Printer{
    @Override
    public void print(String value) {
        super.print(ConsoleColors.GREEN + value + ConsoleColors.RESET);
    }
}
