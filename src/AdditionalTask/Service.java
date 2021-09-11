package AdditionalTask;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private int id;
    private String serviceName;
    private boolean isActive;
    private int serviceMonthPrice;
    private ArrayList<Integer> customerId = new ArrayList<>();

    public Service(int id, String serviceName, boolean isActive, int serviceMonthPrice) {
        this.id = id;
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.serviceMonthPrice = serviceMonthPrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getId() {
        return id;
    }

    public void addCustomer(Integer customerId) {
        this.customerId.add(customerId);
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", isActive=" + isActive +
                ", serviceMonthPrice=" + serviceMonthPrice +
                ", customerIds: " + customerId +
                '}';
    }
}
