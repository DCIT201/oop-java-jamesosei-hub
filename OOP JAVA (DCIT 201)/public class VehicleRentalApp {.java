public class VehicleRentalApp {
    public static void main(String[] args) {
        // Create vehicles
        Car car = new Car("C123", "Toyota Corolla", 50, true);
        Motorcycle motorcycle = new Motorcycle("M123", "James Davidson", 30, true);
        Truck truck = new Truck("T123", "Ford F-150", 80, 3000);

        // Create a rental agency
        RentalAgency agency = new RentalAgency();
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Create a customer
        Customer customer = new Customer("James Osei", "C001");

        // Rent a car
        agency.processRental(customer, car, 3);

        // Rent a motorcycle
        agency.processRental(customer, motorcycle, 2);

        // Return the car
        agency.returnVehicle(customer, car);
    }
}
