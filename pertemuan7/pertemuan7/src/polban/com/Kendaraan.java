package polban.com;

// Abstract class
abstract class Kendaraan {
    protected String model;
    protected String manufacturer;
    protected int year;
    protected boolean isAvailable = true;
    
    public Kendaraan (String model, String manufacturer, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    
    public abstract void start();
    
    public void printDetails() {
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

