public abstract class Vehicle {
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        setBaseRentalRate(baseRentalRate);
        this.isAvailable = true; // Vehicles are available by default
    }

    // Getter and Setter for baseRentalRate with validation
    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0) {
            throw new IllegalArgumentException("Base rental rate must be positive.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    // Getter and Setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // toString() method
    @Override
    public String toString() {
        return "Vehicle{ID=" + vehicleId + ", Model=" + model + ", Rental Rate=" + baseRentalRate + ", Available=" + isAvailable + "}";
    }
}
