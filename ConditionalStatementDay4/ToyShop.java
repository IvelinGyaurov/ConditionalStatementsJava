package ConditionalStatementDay4;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceVacation = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int tedybearsCount = Integer.parseInt(scanner.nextLine());
        int minnionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int totalCount = puzzleCount + dollsCount + tedybearsCount + minnionsCount + trucksCount;

        double totalSum = puzzleCount * 2.60 + dollsCount * 3 + tedybearsCount * 4.10 + minnionsCount * 8.20 + trucksCount * 2;

        if (totalCount >= 50) {
            totalSum = totalSum * 0.75;
        }

        totalSum = totalSum * 0.90;

        double finalSum = totalSum - priceVacation;
        if (totalSum >= priceVacation) {
            System.out.printf("Yes! %.2f lv left.", finalSum);
        } else if (totalSum < priceVacation) {
            finalSum = Math.abs(priceVacation - totalSum);
            System.out.printf("Not enough money! %.2f lv needed.", finalSum);
        }
    }
}
