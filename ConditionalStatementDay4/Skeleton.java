package ConditionalStatementDay4;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100M = Integer.parseInt(scanner.nextLine());

        int totalSecondsTime = minutes * 60 + seconds;
        double lessTime = length / 120;
        double totalLessTime = lessTime * 2.5;
        double timeMarin = (length / 100) * secondsFor100M - totalLessTime;

        if (totalSecondsTime < timeMarin){
            double diff = timeMarin - totalSecondsTime;
            System.out.printf("No, Marin failed! He was %.3f second slower.",diff);
        } else {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",timeMarin);
        }
    }
}
