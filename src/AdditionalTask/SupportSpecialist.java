package AdditionalTask;

import java.util.ArrayList;
import java.util.List;

public class SupportSpecialist extends Profile {
    private int id;
    private String username;
    private String password;
    private int profileId;
    private ArrayList<Integer> ticketId = new ArrayList<>();

    public SupportSpecialist(int id, String username, String password, int profileId, String firstName, String lastName, String email, String phoneNumber, String address, String postalCode) {
        super(profileId, firstName, lastName, email, phoneNumber, address, postalCode, 0, id);
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

    @Override
    public String toString() {
        return "SupportSpecialist{" +
                "\n\tsupportSpecialistId=" + supportSpecialistId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profileId=" + profileId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ",\n\temail='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ",\n\ttickets: {" + ticketId + '}' +
                "\n}";
    }
}
