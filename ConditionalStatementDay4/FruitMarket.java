package ConditionalStatementDay4;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double countBananasInKg = Double.parseDouble(scanner.nextLine());
        double countOrangesInKg = Double.parseDouble(scanner.nextLine());
        double countRaspberriesInKg = Double.parseDouble(scanner.nextLine());
        double countStrawberriesInKg = Double.parseDouble(scanner.nextLine());

        double priceRaspberries = priceStrawberries / 2;
        double priceOranges = priceRaspberries * 0.60;
        double priceBananas = priceRaspberries * 0.20;

        double totalSum = priceStrawberries * countStrawberriesInKg + priceBananas * countBananasInKg + priceOranges * countOrangesInKg + countRaspberriesInKg * priceRaspberries;

        System.out.printf("%.2f",totalSum);
    }
}
