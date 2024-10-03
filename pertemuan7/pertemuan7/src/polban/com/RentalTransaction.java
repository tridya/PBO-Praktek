package polban.com;

class RentalTransaction {
    private Rentable vehicle;
    private int rentalDays;
    private double totalCost;
    
    public RentalTransaction(Rentable vehicle, int rentalDays) throws Exception {
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.totalCost = vehicle.calculateRentalPrice(rentalDays);
    }
    
    public void executeRental() throws Exception {
        vehicle.rent(rentalDays);
        System.out.println("Total rental cost: " + totalCost);
    }
    
    public void returnVehicle() {
        vehicle.returnVehicle();
        System.out.println("Vehicle returned.");
    }
}


