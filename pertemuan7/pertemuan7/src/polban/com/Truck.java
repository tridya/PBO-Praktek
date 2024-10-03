package polban.com;

class Truck extends Kendaraan implements Rentable {
    private double pricePerDay;
    
    public Truck(String model, String manufacturer, int year, double pricePerDay) {
        super(model, manufacturer, year);
        this.pricePerDay = pricePerDay;
    }
    
    @Override
    public void start() {
        System.out.println("Truck is starting.");
    }
    
    @Override
    public double calculateRentalPrice(int days) throws Exception {
        if (days < 1 || days > 30) {
            throw new Exception("Invalid rental duration for a truck.");
        }
        return pricePerDay * days;
    }
    
    @Override
    public void rent(int days) throws Exception {
        if (!isAvailable) {
            throw new Exception("Truck is not available for rent.");
        }
        System.out.println("Truck rented for " + days + " days.");
        setAvailable(false);
    }
    
    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck has been returned.");
    }
}


