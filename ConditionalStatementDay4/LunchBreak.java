package ConditionalStatementDay4;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String serialName = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationBreak / 8.0;
        double freeTime = durationBreak / 4.0;

        double watchTime = durationBreak - lunchTime - freeTime;
        double diff = Math.ceil(Math.abs(watchTime - durationEpisode));

        if (watchTime >= durationEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serialName ,diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,diff);
        }
    }
}
