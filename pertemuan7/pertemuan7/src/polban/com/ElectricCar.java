package polban.com;

// Main class to test the implementation
class ElectricCar extends Car {
    private double batteryCapacity;
    
    public ElectricCar(String model, String manufacturer, int year, double pricePerDay, double batteryCapacity) {
        super(model, manufacturer, year, pricePerDay);
        this.batteryCapacity = batteryCapacity;
    }
    
    @Override
    public void start() {
        System.out.println("Electric car is starting silently.");
    }
    
    public void chargeBattery() {
        System.out.println("Charging battery...");
    }
}

