package ConditionalStatementDay4;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String clas = "";
        String carType = "";
        double totalSum = 0;

        if (budget <= 100){
            clas = "Economy class";
            if (season.equals("Summer")){
                carType = "Cabrio";
                totalSum = budget * 0.35;
            } else if (season.equals("Winter")){
                carType = "Jeep";
                totalSum = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500){
            clas = "Compact class";
            if (season.equals("Summer")){
                carType = "Cabrio";
                totalSum = budget * 0.45;
            } else if (season.equals("Winter")){
                carType = "Jeep";
                totalSum = budget * 0.80;
            }
        } else {
            clas = "Luxury class";
            carType = "Jeep";
            totalSum = budget * 0.90;
        }
        System.out.printf("%s%n",clas);
        System.out.printf("%s - %.2f",carType ,totalSum);
    }
}
