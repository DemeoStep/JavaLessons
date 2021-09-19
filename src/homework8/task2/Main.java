package homework8.task2;

import Console.ConsoleColors;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> office = new ArrayList<>();

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy");
        Date date = new Date(System.currentTimeMillis());

        int yearNow = Integer.parseInt(formatter.format(date));

        fillOfficeWithWorkers(office, yearNow);

        office.sort(Comparator.comparing(Worker::getFio));

        System.out.println("---------------------------------");

        for (Worker worker: office) {
            System.out.println(worker);
        }

        getWorkersByStage(office, yearNow);


    }

    private static void fillOfficeWithWorkers(ArrayList<Worker> office, int yearNow) {
        for(int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);

            System.out.print("Введите ФИО работника: ");
            String fio = input.nextLine().trim();

            System.out.print("Введите должность: ");
            String post = input.nextLine().trim();

            int year = 0;

            do {
                try {
                    System.out.print("Введите год трудоустройства: ");
                    year = input.nextInt();
                    if(year < 1960 || year > yearNow) throw new InputMismatchException();

                } catch (InputMismatchException e) {
                    System.out.println(ConsoleColors.RED.color + "Введен неверный год" + ConsoleColors.RESET.color);

                    if(year == 0 && input.hasNextLine()) {
                        input.nextLine();
                    }

                    year = 0;
                }

            } while (year == 0);

            Worker worker = new Worker(fio, post, year);
            office.add(worker);
        }
    }

    private static void getWorkersByStage(ArrayList<Worker> office, int yearNow) {
        int stage = 0;

        do {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Введите искомый стаж работника: ");
                stage = input.nextInt();
                if(stage < 0 || stage > (yearNow - 1960)) throw new InputMismatchException();

            } catch (InputMismatchException e) {
                System.out.println(ConsoleColors.RED.color + "Введен неверный стаж" + ConsoleColors.RESET.color);

                if(stage == 0) {
                    input.next();
                }

                stage = 0;
            }

        } while (stage == 0);

        System.out.println("Сотрудники, отработавшие больше " + stage + " лет:");
        for (Worker worker: office) {
            if (yearNow - worker.getYear() <= stage) continue;
            System.out.println(worker.getFio());
        }
    }
}
