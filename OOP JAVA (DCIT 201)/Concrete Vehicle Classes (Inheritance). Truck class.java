public class Truck extends Vehicle {
    private double loadCapacity; // Unique feature for trucks

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (loadCapacity > 2000) {
            cost += 50 * days; // Extra cost for heavy load capacity
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Check availability
    }

    // Getter and Setter for loadCapacity
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
