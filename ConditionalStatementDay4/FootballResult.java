package ConditionalStatementDay4;

import java.util.Scanner;

public class FootballResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String firstMatchResult = scanner.nextLine();
        String secondMatchResult = scanner.nextLine();
        String thirdMatchResult = scanner.nextLine();

        int countWins = 0;
        int countDraws = 0;
        int countLoss = 0;

        if (firstMatchResult.charAt(0) > firstMatchResult.charAt(2)){
            countWins++;
        } else if (firstMatchResult.charAt(0) < firstMatchResult.charAt(2)){
            countLoss++;
        } else {
            countDraws++;
        }

        if (secondMatchResult.charAt(0)  > secondMatchResult.charAt(2)){
            countWins++;
        } else if (secondMatchResult.charAt(0) < secondMatchResult.charAt(2)){
            countLoss++;
        } else {
            countDraws++;
        }

        if (thirdMatchResult.charAt(0) > thirdMatchResult.charAt(2)){
            countWins++;
        } else if (thirdMatchResult.charAt(0) < thirdMatchResult.charAt(2)){
            countLoss++;
        } else {
            countDraws++;
        }

        System.out.printf("Team won %d games.%n",countWins);
        System.out.printf("Team lost %d games.%n",countLoss);
        System.out.printf("Drawn games: %d",countDraws);


    }
}
