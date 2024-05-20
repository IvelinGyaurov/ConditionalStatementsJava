package ConditionalStatementDay4;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());


        int countWins = 0;
        int countFinals = 0;
        int countSemiFinals = 0;
        double pointsFromTournaments = 0;

        for (int i = 1; i <= countTournaments ; i++) {
            String text = scanner.nextLine();

            if (text.equals("W")) {
                countWins++;
                pointsFromTournaments += 2000;
            } else if (text.equals("F")){
                countFinals++;
                pointsFromTournaments += 1200;
            } else if (text.equals("SF")){
                countSemiFinals++;
                pointsFromTournaments += 720;
            }


        }
        double averagePoints = pointsFromTournaments / countTournaments;
        double averageWins = (countWins * 1.0 / countTournaments) * 100;
        double totalPoints = pointsFromTournaments + startingPoints;

        System.out.printf("Final points: %.0f%n",totalPoints);
        System.out.printf("Average points: %.0f%n",Math.floor(averagePoints));
        System.out.printf("%.2f%%",averageWins);
    }
}
