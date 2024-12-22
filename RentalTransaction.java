
public class RentalTransaction implements Rentable {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            customer.addRental(vehicle);
            System.out.println("Vehicle rented for " + days + " days.");
        } else {
            System.out.println("Vehicle not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        vehicle.setAvailable(true);
        System.out.println("Vehicle returned.");
    }
}