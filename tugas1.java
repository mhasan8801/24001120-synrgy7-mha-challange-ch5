import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah jam parkir: ");
        int hoursParked = scanner.nextInt();

        double totalCost = calculateParkingFee(hoursParked);

        System.out.printf("Biaya parkir untuk %d jam adalah $%.2f\n", hoursParked, totalCost);

    }

    public static double calculateParkingFee(int hours) {
        double cost;

        if (hours <= 5) {
            cost = 1.0;
        } else if (hours <= 24) {
            cost = 1.0 + (hours - 5) * 0.5;
            if (cost > 15.0) {
                cost = 15.0;
            }
        } else {
            int fullDays = hours / 24;
            int extraHours = hours % 24;
            cost = fullDays * 15.0;

            if (extraHours <= 5) {
                cost += 1.0;
            } else {
                double extraCost = 1.0 + (extraHours - 5) * 0.5;
                if (extraCost > 15.0) {
                    extraCost = 15.0;
                }
                cost += extraCost;
            }
        }

        return cost;
    }

}
