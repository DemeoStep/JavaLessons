package AdditionalTask;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SupportService {
    public static void main(String[] args) {
        //Сначала сгенерируем услуги
        ArrayList<Service> services = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            boolean isActive = false;
            if(i % 2 == 0) {
                isActive = true;
            }
            services.add(
                    new Service(i, "service_" + (i + 1), isActive, (i+1)*100)
            );
        }

        ArrayList<Profile> profiles = new ArrayList<>();

        //Теперь сгенерируем команду поддержки
        ArrayList<SupportSpecialist> support = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            support.add(
                    new SupportSpecialist(i, "admin_" + i, "StRoNg" + i + "PASS", i,
                            "admin" + i, "nimda" + i, "admin_" + i + "@gmail.com", "050424255" + i,
                            "Kiyv, Admin str, 11, office " + i, "01000")
            );
        }

        profiles.addAll(support);

        //Сгенерируем пользователей и накинем им по услуге
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            customers.add(
                    new Customer(i, "customer_" + i, "sTrOnG" + i + "pass", i,
                            "Customer" + i, i + "_customer", "customer" + i + "@gmail.com", "066771827" + i,
                            "Kiyv, Main str, 5, " + i, "01000")
            );

            customers.get(i).addService(services.get(random.nextInt(services.size())));

            //Подкиинем пользователям по тикету
            tickets.add(new Ticket(i, services.get(random.nextInt(services.size())), true, "someProblem_" + i, customers.get(i), support.get(random.nextInt(support.size()))));
        }

        profiles.addAll(customers);

        System.out.println("#fetch_all_customers - выводит список всех клиентов с соответственными профилями\n" +
                "#fetch_all_tickets - выводит список всех тикетов с клиентами без профилей\n" +
                "#fetch_all_specialists - выводит список всех тех сотрудников с профилями и тикетами\n" +
                "#fetch_all_profiles - выводит все профили с соответственными клиентами\n" +
                "#fetch_all_services - выводит все сервисы с соответственными клиентами\n" +
                "#save_tiket_to_file_{id} - сохраняет тикет по указанному id в файл с соответственными Customer SupportSpecialist");

        Scanner input = new Scanner(System.in);
        String request = input.next();

        System.out.println(request);

        switch (request) {
            case "#fetch_all_customers": {
                Fetch.fetch_all_customers(customers);
                break;
            }
            case "#fetch_all_specialists": {
                Fetch.fetch_all_specialists(support);
                break;
            }
        }

        //
        //
        //Fetch.fetch_all_tickets(tickets);
        //Fetch.fetch_all_services(services);
        //Fetch.fetch_all_profiles(profiles);

    }
}
