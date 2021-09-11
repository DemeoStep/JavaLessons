package AdditionalTask;

public class Profile {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String address;
    protected String postalCode;
    protected int userId;
    protected int supportSpecialistId;

    public Profile(int id, String firstName, String lastName, String email, String phoneNumber, String address, String postalCode, int userId, int supportSpecialistId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.userId = userId;
        this.supportSpecialistId = supportSpecialistId;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", userId=" + userId +
                ", supportSpecialistId=" + supportSpecialistId +
                '}';
    }
}
