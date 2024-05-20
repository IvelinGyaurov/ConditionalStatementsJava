package ConditionalStatementDay4;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String place = "";
        double totalPrice = 0;

        if (budget <= 1000) {
            place = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                totalPrice = budget * 0.65;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                totalPrice = budget * 0.45;
            }
        } else if (budget > 1000 && budget <= 3000) {
            place = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                totalPrice = budget * 0.80;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                totalPrice = budget * 0.60;
            }
        } else if (budget > 3000) {
            place = "Hotel";
            if (season.equals("Summer")) {
                location = "Alaska";
                totalPrice = budget * 0.90;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                totalPrice = budget * 0.90;
            }
        }
        System.out.printf("%s - %s - %.2f",location ,place , totalPrice);
    }
}

