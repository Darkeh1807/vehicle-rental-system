
public class Truck extends Vehicle {
    private double dailyRate;
    private boolean available;
    private double additionalInsuranceCost;

    public Truck(double dailyRate, boolean available, double additionalInsuranceCost, String vehicleId, String model,
            double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
        this.dailyRate = dailyRate;
        this.available = available;
        this.additionalInsuranceCost = additionalInsuranceCost;

    }

    @Override
    public double calculateRentalCost(int days) {

        double cost = days * dailyRate;
        cost += additionalInsuranceCost * days;
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return available;
    }

    public double getAdditionalInsuranceCost() {
        return additionalInsuranceCost;
    }
}