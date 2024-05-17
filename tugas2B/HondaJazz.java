package tugas2B;

class HondaJazz extends Car{

    private String model = "Honda Jazz";

    public HondaJazz(double fuelCapacity) {
        super(fuelCapacity);
    }

    @Override
    public void moveForward() {
        System.out.println(model + " melaju dengan cepat");
    }

    @Override
    public void turn() {
        System.out.println(model + " belok sedikit.");
    }

    public void ecoMode() {
        System.out.println(model + " mode hemat aktif");
    }

}
