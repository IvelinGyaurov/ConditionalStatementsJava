package ConditionalStatementDay4;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входните данни
        int restingDays = Integer.parseInt(scanner.nextLine());

        // Изчисляване на работните дни
        int workingDays = 365 - restingDays;

        // Изчисляване на времето за игра
        int playTime = (workingDays * 63) + (restingDays * 127);

        // Изчисляване на разликата от нормата
        int difference = Math.abs(30000 - playTime);
        int hoursDifference = difference / 60;
        int minutesDifference = difference % 60;

        // Проверка и отпечатване на резултата
        if (playTime > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play%n", hoursDifference, minutesDifference);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play%n", hoursDifference, minutesDifference);
        }
    }
}
