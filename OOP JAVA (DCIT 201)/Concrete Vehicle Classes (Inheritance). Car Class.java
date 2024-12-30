public class Car extends Vehicle {
    private boolean hasGPS; // Unique feature for cars

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasGPS) {
            cost += 10 * days; // Add extra cost for GPS
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Check availability
    }

    // Getter and Setter for hasGPS
    public boolean hasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
}
