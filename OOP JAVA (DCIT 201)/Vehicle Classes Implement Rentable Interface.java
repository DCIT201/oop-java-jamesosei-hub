// Example in Car class:
@Override
public void rent(Customer customer, int days) {
    if (isAvailableForRental()) {
        // Process rental and mark as unavailable
        customer.addRentalRecord(this);
        setAvailable(false);
        System.out.println("Car rented to " + customer.getName() + " for " + days + " days.");
    } else {
        System.out.println("Car is not available for rental.");
    }
}

@Override
public void returnVehicle() {
    setAvailable(true);
    System.out.println("Vehicle returned and is now available for rental.");
}
