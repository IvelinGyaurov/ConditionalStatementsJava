package ConditionalStatementDay4;

import java.util.Scanner;

public class GodzillaVSKong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double priceForClothesForOnePerson = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;

        double totalClothesSum = countStatists * priceForClothesForOnePerson;
        if (countStatists >= 150){
            totalClothesSum = totalClothesSum * 0.90;
        }

        double totalSum = decorPrice + totalClothesSum;

        if (budget >= totalSum){
            double diff = budget - totalSum;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        } else {
            double diff2 = Math.abs(totalSum - budget);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff2);
        }
    }
}
