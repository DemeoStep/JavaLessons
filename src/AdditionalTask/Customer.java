package AdditionalTask;

import java.util.ArrayList;

public class Customer extends Profile{
    private int id;
    private String username;
    private String password;
    private int profileId;
    private ArrayList<Integer> serviceId = new ArrayList<>();
    private ArrayList<Integer> ticketId = new ArrayList<>();

    public Customer(int id, String username, String password, int profileId, String firstName, String lastName, String email, String phoneNumber, String address, String postalCode) {
        super(profileId, firstName, lastName, email, phoneNumber, address, postalCode, id, 0);
        this.id = id;
        this.username = username;
        this.password = password;
        this.profileId = profileId;
    }

    public int getId() {
        return id;
    }

    public void addTicket(int ticketId) {
        this.ticketId.add(ticketId);
    }

    public void addService(Service service) {
        this.serviceId.add(service.getId());
        service.addCustomer(this.id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "\n\tuserId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profileId=" + profileId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ",\n\temail='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", \n\tservices: {" + serviceId + '}' +
                ", \n\ttickets: {" + ticketId + '}' +
                "\n}";
    }
}
