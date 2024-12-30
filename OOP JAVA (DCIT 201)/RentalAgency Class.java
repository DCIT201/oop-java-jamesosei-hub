import java.util.List;
import java.util.ArrayList;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.rent(customer, days);
        } else {
            System.out.println("Vehicle is unavailable for rental.");
        }
    }

    public void returnVehicle(Customer customer, Vehicle vehicle) {
        vehicle.returnVehicle();
    }
}
