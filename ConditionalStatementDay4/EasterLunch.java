package ConditionalStatementDay4;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countKozunak = Integer.parseInt(scanner.nextLine());
        int countEggs = Integer.parseInt(scanner.nextLine());
        int kgKurabii = Integer.parseInt(scanner.nextLine());

        double totalKozunakPrice = countKozunak * 3.20;
        double totalEggs = countEggs * 4.35;
        double totalKurabii = kgKurabii * 5.40;
        double totalEggsPaint = countEggs * 12 * 0.15;

        double totalSum = totalKozunakPrice + totalEggs + totalKurabii + totalEggsPaint;

        System.out.printf("%.2f",totalSum);
    }
}
