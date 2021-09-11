package AdditionalTask;

public class Ticket {
    private int id;
    private String serviceName;
    private boolean isActive;
    private String problemDescription;
    private int customerId;
    private int supportSpecialistId;

    public Ticket(int id, Service service, boolean isActive, String problemDescription, Customer customer, SupportSpecialist supportSpecialist) {
        this.id = id;
        this.serviceName = service.getServiceName();
        this.isActive = isActive;
        this.problemDescription = problemDescription;
        this.customerId = customer.getId();
        this.supportSpecialistId = supportSpecialist.getId();

        customer.addTicket(id);
        supportSpecialist.addTicket(id);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", isActive=" + isActive +
                ", problemDescription='" + problemDescription + '\'' +
                ", customerId=" + customerId +
                ", supportSpecialistId=" + supportSpecialistId +
                '}';
    }
}
