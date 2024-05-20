package ConditionalStatementDay4;

import javax.swing.*;
import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countBoughtChrysanthemums = Integer.parseInt(scanner.nextLine());
        int countBoughtRoses = Integer.parseInt(scanner.nextLine());
        int countBoughtTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String dayIsFestival = scanner.nextLine();

        double totalChrysanthemumsPrice = 0;
        double totalRosesPrice = 0;
        double totalTulipsPrice = 0;
        switch (season){
            case "Spring":
            case "Summer":
                totalChrysanthemumsPrice = countBoughtChrysanthemums * 2.00;
                totalRosesPrice = countBoughtRoses * 4.10;
                totalTulipsPrice = countBoughtTulips * 2.50;
                break;
            case "Autumn":
            case "Winter":
                totalChrysanthemumsPrice = countBoughtChrysanthemums * 3.75;
                totalRosesPrice = countBoughtRoses * 4.50;
                totalTulipsPrice = countBoughtTulips * 4.15;
                break;
        }
        double totalSum = totalChrysanthemumsPrice + totalRosesPrice + totalTulipsPrice;
        if (dayIsFestival.equals("Y")){
            totalSum = totalSum + totalSum * 0.15;
        }
        if (countBoughtTulips > 7 && season.equals("Spring")){
            totalSum = totalSum - totalSum * 0.05;
        }
        if (countBoughtRoses >= 10 && season.equals("Winter")){
            totalSum = totalSum - totalSum * 0.10;
        }
        if (countBoughtTulips + countBoughtRoses + countBoughtChrysanthemums > 20){
            totalSum = totalSum - totalSum * 0.20;
        }
        double totalArrangeSum = totalSum + 2.00;
        System.out.printf("%.2f",totalArrangeSum);
    }
}
