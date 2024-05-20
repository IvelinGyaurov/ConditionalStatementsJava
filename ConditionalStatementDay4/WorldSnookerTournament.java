package ConditionalStatementDay4;

import java.util.Scanner;

public class WorldSnookerTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String typeTicket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        String photoWithTrophy = scanner.nextLine();

        double totalPrice = 0;
        switch (typeTicket) {
            case "Standard":
                if (stage.equals("Quarter final")) {
                    totalPrice = 55.50;
                } else if (stage.equals("Semi final")) {
                    totalPrice = 75.88;
                } else if (stage.equals("Final")) {
                    totalPrice = 110.10;
                }
                break;
            case "Premium":
                if (stage.equals("Quarter final")) {
                    totalPrice = 105.20;
                } else if (stage.equals("Semi final")) {
                    totalPrice = 125.22;
                } else if (stage.equals("Final")) {
                    totalPrice = 160.66;
                }
                break;
            case "VIP":
                if (stage.equals("Quarter final")) {
                    totalPrice = 118.90;
                } else if (stage.equals("Semi final")) {
                    totalPrice = 300.40;
                } else if (stage.equals("Final")) {
                    totalPrice = 400.00;
                }
                break;
        }

        double totalSum = totalPrice * countTickets;
        if (totalSum <= 2500 && photoWithTrophy.equals("Y")) {
            totalSum += countTickets * 40;
        } else if (totalSum > 2500 && totalSum <= 4000) {
            totalSum = totalSum * 0.90;
            if (photoWithTrophy.equals("Y")) {
                totalSum += countTickets * 40;
            }
        } else if (totalSum > 4000) {
            totalSum = totalSum * 0.75;
        }

        System.out.printf("%.2f", totalSum);
    }
}

