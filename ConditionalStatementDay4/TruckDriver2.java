package ConditionalStatementDay4;

import java.util.Scanner;

public class TruckDriver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;

        if (km <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                totalSum = km * 0.75 * 4 * 0.90;
            } else if (season.equals("Summer")) {
                totalSum = km * 0.90 * 4 * 0.90;
            } else if (season.equals("Winter")) {
                totalSum = km * 1.05 * 4 * 0.90;
            }
        } else if (km > 5000 && km <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                totalSum = km * 0.95 * 4 * 0.90;
            } else if (season.equals("Summer")) {
                totalSum = km * 1.10 * 4 * 0.90;
            } else if (season.equals("Winter")) {
                totalSum = km * 1.25 * 4 * 0.90;
            }
        } else {
            totalSum = km * 1.45 * 4 * 0.90;
        }
        System.out.printf("%.2f", totalSum);
    }
}
