package AdditionalTask;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    static void genServices(ArrayList<Service> services, int count) {
        for (int i = 0; i < count; i++) {
            boolean isActive = false;
            if(i % 2 == 0) {
                isActive = true;
            }
            services.add(
                    new Service(i, "service_" + (i + 1), isActive, (i+1)*100)
            );
        }
    }

    static void genSupport(ArrayList<SupportSpecialist> support, int count) {
        for (int i = 0; i < count; i++) {
            support.add(
                    new SupportSpecialist(i, "admin_" + i, "StRoNg" + i + "PASS", i,
                            "admin" + i, "nimda" + i, "admin_" + i + "@gmail.com", "050424255" + i,
                            "Kiyv, Admin str, 11, office " + i, "01000")
            );
        }
    }

    static void genCustomersWithServicesAndTickets(ArrayList<Customer> customers, ArrayList<Service> services, ArrayList<SupportSpecialist> support, ArrayList<Ticket> tickets, int count) {
        for (int i = 0; i < count; i++) {
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
    }
}
