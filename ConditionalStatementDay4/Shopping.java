package ConditionalStatementDay4;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countCPU = Integer.parseInt(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());

        double videoCardPrice =countVideoCards * 250;
        double priceCPU =countCPU * (videoCardPrice * 0.35);
        double ramPrice =countRAM * (videoCardPrice * 0.10);

        double totalSum = videoCardPrice + priceCPU + ramPrice;

        if (countVideoCards > countCPU) {
            totalSum = totalSum * 0.85;
        }

        if (budget >= totalSum) {
            double restMoney = budget - totalSum;
            System.out.printf("You have %.2f leva left!",restMoney);
        } else if (budget < totalSum) {
            double restMoney = totalSum - budget;
            System.out.printf("Not enough money! You need %.2f leva more!",restMoney);
        }

    }
}
