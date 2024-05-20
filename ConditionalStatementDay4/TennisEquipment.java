package ConditionalStatementDay4;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceForOneTennisRocket = Double.parseDouble(scanner.nextLine());
        int countTennisRocket = Integer.parseInt(scanner.nextLine());
        int countPairSneakers = Integer.parseInt(scanner.nextLine());

        double totalPriceForRockets = priceForOneTennisRocket * countTennisRocket;
        double totalPriceForSneakers = priceForOneTennisRocket / 6;
        double totalSneakersPrice = countPairSneakers * totalPriceForSneakers;
        double priceForAll = (totalPriceForRockets + totalSneakersPrice) * 0.2;
        double totalSum = totalPriceForRockets + totalSneakersPrice + priceForAll;
        double totalSumDjokovic = totalSum / 8;
        double totalSponsorsSum = totalSum * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(totalSumDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(totalSponsorsSum));
    }
}
