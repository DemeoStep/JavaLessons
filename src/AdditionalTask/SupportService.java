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


        Requests.doRequest(services, support, customers, tickets, profiles);

    }


}
