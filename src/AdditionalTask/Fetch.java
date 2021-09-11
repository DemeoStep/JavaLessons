package AdditionalTask;

import java.util.ArrayList;

public class Fetch {
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
}
