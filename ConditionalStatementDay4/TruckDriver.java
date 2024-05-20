package ConditionalStatementDay4;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;

        switch (season){
            case "Spring":
            case "Autumn":
                if (km <= 5000){
                    totalSum = km * 0.75 * 4 * 0.90;
                } else if (km > 5000 && km <= 10000){
                    totalSum = km * 0.95 * 4 * 0.90;
                } else {
                    totalSum = km * 1.45 * 4 * 0.90;
                }
                break;
            case "Summer":
                if (km <= 5000){
                    totalSum = km * 0.90 * 4 * 0.90;
                } else if (km > 5000 && km <= 10000){
                    totalSum = km * 1.10 * 4 * 0.90;
                } else {
                    totalSum = km * 1.45 * 4 * 0.90;
                }
                break;
            case "Winter":
                if (km <= 5000){
                    totalSum = km * 1.05 * 4 * 0.90;
                } else if (km > 5000 && km <= 10000){
                    totalSum = km * 1.25 * 4 * 0.90;
                } else {
                    totalSum = km * 1.45 * 4 * 0.90;
                }
                break;
        }
        System.out.printf("%.2f",totalSum);
    }
}
