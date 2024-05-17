package tugas2B;

class ToyotaFortuner extends Car{

    private String model = "Toyota Fortuner";

    public ToyotaFortuner(double fuelCapacity) {
        super(fuelCapacity);
    }

    @Override
    public void moveForward() {
        System.out.println(model + "  melaju dengan cepat");
    }

    @Override
    public void turn() {
        System.out.println(model + " belok stabil");
    }

    public void offRoadMode() {
        System.out.println(model + " mode off-road aktif");
    }

}
