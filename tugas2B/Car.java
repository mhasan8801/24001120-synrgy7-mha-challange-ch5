package tugas2B;

class Car extends Vehicle{

    private double fuelCapacity;

    public Car(double fuelCapacity) {
        super(4); // Mobil punya 4 roda
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void changeGear() {
        System.out.println("Transmisi mobil berubah.");
    }

}
