package polban.com;

public class Main {
    public static void main(String[] args) {
        try {
            // Membuat berbagai kendaraan
            Kendaraan car = new Car("Model S", "Tesla", 2023, 200);
            Kendaraan electricCar = new ElectricCar("Leaf", "Nissan", 2022, 180, 100);
            Kendaraan truck = new Truck("F-150", "Ford", 2020, 300);
            
            // Memulai kendaraan dan mencetak detailnya
            car.start();
            car.printDetails();
            
            electricCar.start();
            electricCar.printDetails();
            
            truck.start();
            truck.printDetails();
            
    
            System.out.println();

            // Proses penyewaan kendaraan
            RentalTransaction carRental = new RentalTransaction((Rentable) car, 5);
            carRental.executeRental();
            carRental.returnVehicle();

            System.out.println();
            
            // Menyewa truk
            RentalTransaction truckRental = new RentalTransaction((Rentable) truck, 10);
            truckRental.executeRental();
            truckRental.returnVehicle();
            
            System.out.println();
            
            // Menyewa bus

            System.out.println();
            
            // Menyewa dan menggunakan fitur khusus ElectricCar
            ElectricCar electricVehicle = (ElectricCar) electricCar; // Cast untuk menggunakan fitur khusus
            RentalTransaction electricCarRental = new RentalTransaction(electricVehicle, 3);
            electricCarRental.executeRental();
            electricCarRental.returnVehicle();
            
            electricVehicle.chargeBattery(); // Mengisi daya baterai ElectricCar
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


