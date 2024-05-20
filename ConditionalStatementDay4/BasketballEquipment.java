package ConditionalStatementDay4;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int taxPerYear = Integer.parseInt(scanner.nextLine());

        double priceForSneakers = taxPerYear * 0.6;
        double priceForEquip = priceForSneakers * 0.8;
        double priceForBall = priceForEquip /4;
        double priceForAccesoaries = priceForBall /5;
        double totalSum =taxPerYear + priceForSneakers + priceForEquip + priceForBall + priceForAccesoaries;

        System.out.printf("%.2f",totalSum);
    }
}
