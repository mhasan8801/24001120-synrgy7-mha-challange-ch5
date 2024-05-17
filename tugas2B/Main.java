package tugas2B;

public class Main {

    public static void main(String[] args) {

        HondaJazz hondaJazz = new HondaJazz(60);
        ToyotaFortuner toyotaFortuner = new ToyotaFortuner(100);
        SuzukiKatana suzukiKatana = new SuzukiKatana(70);

        hondaJazz.moveForward();
        hondaJazz.turn();
        hondaJazz.ecoMode();

        toyotaFortuner.moveForward();
        toyotaFortuner.turn();
        toyotaFortuner.offRoadMode();

        suzukiKatana.moveForward();
        suzukiKatana.turn();
        suzukiKatana.sportMode();

    }

}
