package tugas2B;

class Vehicle {

    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void moveForward() {
        System.out.println("Kendaraan bergerak maju.");
    }

    public void turn() {
        System.out.println("Kendaraan berbelok.");
    }

}
