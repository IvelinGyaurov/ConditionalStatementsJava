package ConditionalStatementDay4;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;

        int totalMinutes = totalTime / 60;
        int totalSeconds = totalTime % 60;

        if (totalSeconds < 10) {
            System.out.printf("%d:%02d", totalMinutes, totalSeconds);
        } else {
            System.out.printf("%d:%d", totalMinutes,totalSeconds);
        }
    }
}
