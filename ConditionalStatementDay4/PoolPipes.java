package ConditionalStatementDay4;

import java.util.Scanner;

public class PoolPipes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входните данни
        int poolVolume = Integer.parseInt(scanner.nextLine());
        int pipe1Debit = Integer.parseInt(scanner.nextLine());
        int pipe2Debit = Integer.parseInt(scanner.nextLine());
        double hoursAbsent = Double.parseDouble(scanner.nextLine());

        // Изчисляване на обема на водата, която е стекла през тръбите
        double pipe1Water = pipe1Debit * hoursAbsent;
        double pipe2Water = pipe2Debit * hoursAbsent;
        double totalWater = pipe1Water + pipe2Water;

        // Проверка дали басейнът е се е препълнил
        if (totalWater <= poolVolume) {
            double poolPercentage = (totalWater / poolVolume) * 100;
            double pipe1Percentage = (pipe1Water / totalWater) * 100;
            double pipe2Percentage = (pipe2Water / totalWater) * 100;

            // Отпечатване на състоянието на басейна
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.%n",
                    poolPercentage, pipe1Percentage, pipe2Percentage);
        } else {
            double overflowLiters = totalWater - poolVolume;

            // Отпечатване на препълването на басейна
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.%n",
                    hoursAbsent, overflowLiters);
        }
    }
}
