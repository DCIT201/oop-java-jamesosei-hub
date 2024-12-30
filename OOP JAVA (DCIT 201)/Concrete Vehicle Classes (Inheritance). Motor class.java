public class Motorcycle extends Vehicle {
    private boolean hasHelmet; // Unique feature for motorcycles

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasHelmet) {
        super(vehicleId, model, baseRentalRate);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasHelmet) {
            cost += 5 * days; // Add extra cost for helmet
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Check availability
    }

    // Getter and Setter for hasHelmet
    public boolean hasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }
}
