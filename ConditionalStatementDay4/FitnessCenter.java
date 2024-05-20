package ConditionalStatementDay4;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countVisitors = Integer.parseInt(scanner.nextLine());

        int countBack = 0;
        int countChest = 0;
        int countLegs = 0;
        int countAbs = 0;
        int countBoughtProteinShake = 0;
        int countBoughtProteinBar = 0;
        int totalTrainers = 0;
        int totalBuyers = 0;

        for (int i = 1; i <= countVisitors ; i++) {
            String text = scanner.nextLine();

            if (text.equals("Back")){
                countBack++;
                totalTrainers++;
            } else if (text.equals("Chest")){
                countChest++;
                totalTrainers++;
            } else if (text.equals("Legs")){
                countLegs++;
                totalTrainers++;
            } else if (text.equals("Abs")){
                countAbs++;
                totalTrainers++;
            } else if (text.equals("Protein shake")){
                countBoughtProteinShake++;
                totalBuyers++;
            } else if (text.equals("Protein bar")){
                countBoughtProteinBar++;
                totalBuyers++;
            }


        }
        double averageTrainingPercent = totalTrainers * 1.0 / countVisitors * 100;
        double averageBuyersPercent = totalBuyers * 1.0 / countVisitors * 100;
        System.out.printf("%d - back%n",countBack);
        System.out.printf("%d - chest%n",countChest);
        System.out.printf("%d - legs%n",countLegs);
        System.out.printf("%d - abs%n",countAbs);
        System.out.printf("%d - protein shake%n",countBoughtProteinShake);
        System.out.printf("%d - protein bar%n",countBoughtProteinBar);
        System.out.printf("%.2f%% - work out%n",averageTrainingPercent);
        System.out.printf("%.2f%% - protein",averageBuyersPercent);

    }
}
