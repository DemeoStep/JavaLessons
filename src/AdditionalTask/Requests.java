package AdditionalTask;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Requests {
    static void fetch_all_customers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    static void fetch_all_specialists(ArrayList<SupportSpecialist> support) {
        for (SupportSpecialist sup : support) {
            System.out.println(sup);
        }
    }

    static void fetch_all_tickets(ArrayList<Ticket> tickets) {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    static void fetch_all_services(ArrayList<Service> services) {
        for (Service service : services) {
            System.out.println(service);
        }
    }

    static void fetch_all_profiles(ArrayList<Profile> profiles) {
        for (Profile profile : profiles) {
            System.out.println(profile);
        }
    }

    public static void save_ticket_to_file(ArrayList<Ticket> tickets, int id) {
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
