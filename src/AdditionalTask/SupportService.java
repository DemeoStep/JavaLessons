package AdditionalTask;

import java.util.ArrayList;
import java.util.Scanner;

public class SupportService {

    public static void main(String[] args) {
        //Сначала сгенерируем услуги
        ArrayList<Service> services = new ArrayList<>();
        Generator.genServices(services, 5);

        //Теперь сгенерируем команду поддержки
        ArrayList<SupportSpecialist> support = new ArrayList<>();
        Generator.genSupport(support, 3);

        //Сгенерируем пользователей и накинем им по услуге
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();

        Generator.genCustomersWithServicesAndTickets(customers, services, support, tickets, 10);

        //"Сольем" профили клиентов и саппорта в одну коллекцию
        ArrayList<Profile> profiles = new ArrayList<>();
        profiles.addAll(support);
        profiles.addAll(customers);


        Request(services, support, customers, tickets, profiles);

    }

    private static void Request(ArrayList<Service> services, ArrayList<SupportSpecialist> support, ArrayList<Customer> customers, ArrayList<Ticket> tickets, ArrayList<Profile> profiles) {
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
                Requests.fetch_all_customers(customers);
                break;
            }
            case "#fetch_all_specialists": {
                Requests.fetch_all_specialists(support);
                break;
            }
            case "#fetch_all_tickets": {
                Requests.fetch_all_tickets(tickets);
                break;
            }
            case "#fetch_all_services": {
                Requests.fetch_all_services(services);
                break;
            }
            case "#fetch_all_profiles": {
                Requests.fetch_all_profiles(profiles);
                break;
            }
            default: {
                System.out.println("Вы ввели неверный запрос...");
            }
        }
    }
}
