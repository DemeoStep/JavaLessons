package homework8.add_task;

import Console.ConsoleColor;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Calculator {
    private static double num_1, num_2;

    public static void add() {
        double result = num_1 + num_2;
        System.out.println(num_1 + " + " + num_2 + " = " + result);
    }

    public static void sub() {
        double result = num_1 - num_2;
        System.out.println(num_1 + " - " + num_2 + " = " + result);
    }

    public static void mul() {
        double result = num_1 * num_2;
        System.out.println(num_1 + " * " + num_2 + " = " + result);
    }

    public static void div() {
        try {
            if(num_2 == 0.0) throw new Exception("Деление на ноль");
            double result = num_1 / num_2;
            System.out.println(num_1 + " / " + num_2 + " = " + result);
        } catch (Exception e) {
            System.out.println(ConsoleColor.RED + e.getMessage() + ConsoleColor.RESET);
        }

    }

    public static void calculate() {
        num_1 = numInput("Введите первое число: ");
        num_2 = numInput("Введите второе число: ");

        boolean isError;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите операцию (add - сложение, sub - вычитание, mul - умножение, div - деление): ");

            switch (input.nextLine().trim()) {
                case "add": {
                    add();
                    isError = false;
                    break;
                }
                case "sub": {
                    sub();
                    isError = false;
                    break;
                }
                case "mul": {
                    mul();
                    isError = false;
                    break;
                }
                case "div": {
                    div();
                    isError = false;
                    break;
                }
                default: {
                    isError = true;
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println(ConsoleColor.RED + "Некорректный ввод операции!" + ConsoleColor.RESET);
                    }
                }
            }
        } while (isError);

    }

    private static double numInput(String mess) {
        Scanner input;
        double result = 0;
        boolean hasResult = false;

        do {
            input = new Scanner(System.in);

            System.out.print(mess);

            try {
                result = input.nextDouble();
                hasResult = true;

            } catch (InputMismatchException e) {
                System.out.println(ConsoleColor.RED + "Некорректный ввод!" + ConsoleColor.RESET);
            }

        } while (!hasResult);

        return result;
    }

}
