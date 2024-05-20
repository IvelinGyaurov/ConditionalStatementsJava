package ConditionalStatementDay4;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distanceInMeters / 15))* 12.5;

        double result = distanceInMeters * timeInSecondsForOneMeter + delay;

        if (result < record ) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        } else if ( result >= record) {
            double restTime = result - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.",restTime);
        }
    }
}
