package ConditionalStatementDay4;

import java.util.Scanner;

public class Vacation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String place = "";
        double totalPrice = 0;

        switch (season){
            case "Summer":
                location = "Alaska";
                if (budget <= 1000){
                    place = "Camp";
                    totalPrice = budget * 0.65;
                } else if (budget > 1000 && budget <= 3000){
                    place = "Hut";
                    totalPrice = budget * 0.80;
                } else {
                    place = "Hotel";
                    totalPrice = budget * 0.90;
                }
                break;
            case "Winter":
                location = "Morocco";
                if (budget <= 1000){
                    place = "Camp";
                    totalPrice = budget * 0.45;
                } else if (budget > 1000 && budget <= 3000){
                    place = "Hut";
                    totalPrice = budget * 0.60;
                } else {
                    place = "Hotel";
                    totalPrice = budget * 0.90;
                }
                break;
        }
        System.out.printf("%s - %s - %.2f",location ,place , totalPrice);
    }
}
