package ConditionalStatementDay4;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budgetFilm = Double.parseDouble(scanner.nextLine());
        int countExtra = Integer.parseInt(scanner.nextLine());
        double priceForClothesForOnePerson = Double.parseDouble(scanner.nextLine());

        double priceDecor = budgetFilm * 0.1;
        double totalPriceForClothesForExtra = priceForClothesForOnePerson * countExtra;
        if (countExtra > 150) {
            totalPriceForClothesForExtra = totalPriceForClothesForExtra *0.9;
        }

        double totalSum = totalPriceForClothesForExtra + priceDecor;

        if (totalSum > budgetFilm) {
            double restMoney =Math.abs(totalSum - budgetFilm);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",restMoney);
        } else if (totalSum <= budgetFilm) {
            double restMoney = budgetFilm - totalSum;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",restMoney);
        }
    }

}
