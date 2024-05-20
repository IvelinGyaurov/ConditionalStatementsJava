package ConditionalStatementDay4;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Четене на входните данни
            String fuelType = scanner.nextLine().toLowerCase();
            double fuelQuantity = Double.parseDouble(scanner.nextLine());

            // Проверка на вида гориво и количеството в резервоара
            switch (fuelType) {
                case "diesel":
                case "gasoline":
                case "gas":
                    if (fuelQuantity >= 25) {
                        System.out.printf("You have enough %s.%n", fuelType);
                    } else {
                        System.out.printf("Fill your tank with %s!%n", fuelType);
                    }
                    break;
                default:
                    System.out.println("Invalid fuel!");
                    break;
            }
        }
    }