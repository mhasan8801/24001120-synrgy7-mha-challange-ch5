package tugas2B;

class SuzukiKatana extends Car{

    private String model = "Suzuki Katana";

    public SuzukiKatana(double fuelCapacity) {
        super(fuelCapacity);
    }

    @Override
    public void moveForward() {
        System.out.println(model + " melaju dengan santai");
    }

    @Override
    public void turn() {
        System.out.println(model + " belok dengan cepat");
    }

    public void sportMode() {
        System.out.println(model + " mode sport aktif");
    }

}
