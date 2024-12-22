import java.util.List;
import java.util.ArrayList;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Vehicle vehicle, Customer customer, int days) {
        RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
        transaction.rent(customer, days);
        transactions.add(transaction);
    }

    public void returnVehicle(Vehicle vehicle) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getVehicle().equals(vehicle)) {
                transaction.returnVehicle();
                break;
            }
        }
    }

    public void generateReport() {
        // Generate report logic
    }
}