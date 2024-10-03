package polban.com;

// Concrete class that implements abstract class and interface
class Car extends Kendaraan implements Rentable {
    protected double pricePerDay;
    
    public Car(String model, String manufacturer, int year, double pricePerDay) {
        super(model, manufacturer, year);
        this.pricePerDay = pricePerDay;
    }
    
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    
    @Override
    public double calculateRentalPrice(int days) throws Exception {
        if (days < 1) {
            throw new Exception("Invalid rental duration. It must be at least 1 day.");
        }
        return pricePerDay * days;
    }
    
    @Override
    public void rent(int days) throws Exception {
        if (!isAvailable) {
            throw new Exception("Car is not available for rent.");
        }
        System.out.println("Car rented for " + days + " days.");
        setAvailable(false);
    }
    
    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car has been returned.");
    }
}


