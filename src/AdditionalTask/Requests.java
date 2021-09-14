package AdditionalTask;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Requests {

    public static void doRequest(ArrayList<Service> services, ArrayList<SupportSpecialist> support, ArrayList<Customer> customers, ArrayList<Ticket> tickets, ArrayList<Profile> profiles) {
        System.out.println("Список доступных запросов:\n" +
                "#fetch_all_customers - выводит список всех клиентов с соответственными профилями\n" +
                "#fetch_all_tickets - выводит список всех тикетов с клиентами без профилей\n" +
                "#fetch_all_specialists - выводит список всех тех сотрудников с профилями и тикетами\n" +
                "#fetch_all_profiles - выводит все профили с соответственными клиентами\n" +
                "#fetch_all_services - выводит все сервисы с соответственными клиентами\n" +
                "#save_ticket_to_file_{id} - сохраняет тикет по указанному id в файл с соответственными Customer SupportSpecialist\n");

        System.out.print("Введите запрос: ");
        Scanner input = new Scanner(System.in);
        String request = input.next();

        if(request.contains("#save_ticket_to_file_")) {
            String str = request.substring(request.indexOf('{') + 1).replace("}", "");

            int id = -1;

            try{
                id = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Введен неверный id");
            }

            Requests.save_ticket_to_file(tickets, id);
            return;
        }

        switch (request) {
            case "#fetch_all_customers": {
                fetch_all_customers(customers);
                break;
            }
            case "#fetch_all_specialists": {
                fetch_all_specialists(support);
                break;
            }
            case "#fetch_all_tickets": {
                fetch_all_tickets(tickets);
                break;
            }
            case "#fetch_all_services": {
                fetch_all_services(services);
                break;
            }
            case "#fetch_all_profiles": {
                fetch_all_profiles(profiles);
                break;
            }
            default: {
                System.out.println("Вы ввели неверный запрос...");
            }
        }
    }

    private static void fetch_all_customers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private static void fetch_all_specialists(ArrayList<SupportSpecialist> support) {
        for (SupportSpecialist sup : support) {
            System.out.println(sup);
        }
    }

    private static void fetch_all_tickets(ArrayList<Ticket> tickets) {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    private static void fetch_all_services(ArrayList<Service> services) {
        for (Service service : services) {
            System.out.println(service);
        }
    }

    private static void fetch_all_profiles(ArrayList<Profile> profiles) {
        for (Profile profile : profiles) {
            System.out.println(profile);
        }
    }

    private static void save_ticket_to_file(ArrayList<Ticket> tickets, int id) {
        if (id < 0) {
            return;
        }

        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                try (FileWriter writer = new FileWriter("ticket_{" + id + "}.txt", false)) {

                    writer.write(ticket.toJson());
                    writer.flush();

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }

        System.out.println("Введен несуществующий id");
    }
}
