package ConditionalStatementDay4;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceForFlourPerKg = Double.parseDouble(scanner.nextLine());
        double flourKG = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int countEggs = Integer.parseInt(scanner.nextLine());
        int countMayaPacks = Integer.parseInt(scanner.nextLine());

        double pricePerKGSugar = priceForFlourPerKg * 0.75;
        double priceForEggs = priceForFlourPerKg + priceForFlourPerKg * 0.10;
        double priceForPackMaya = pricePerKGSugar * 0.2;

        double totalSugar = pricePerKGSugar * sugarKg;
        double totalFlour = priceForFlourPerKg * flourKG;
        double totalEggs = countEggs * priceForEggs;
        double totalMaya = countMayaPacks * priceForPackMaya;

        double totalSum = totalEggs + totalFlour + totalMaya + totalSugar;

        System.out.printf("%.2f",totalSum);
    }
}
