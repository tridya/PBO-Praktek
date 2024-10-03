package polban.com;

// Interface
interface Rentable {
    public double calculateRentalPrice(int days) throws Exception;
    public void rent(int days) throws Exception;
    public void returnVehicle();
}
