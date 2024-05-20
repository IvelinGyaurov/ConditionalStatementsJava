package ConditionalStatementDay4;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double newNumber = 0;
        while (number >= 0){
            newNumber = number * 2.0;
            System.out.printf("Result: %.2f %n",newNumber);

            number = Double.parseDouble(scanner.nextLine());
        }

        if (number < 0){
            System.out.println("Negative number!");
        }
    }
}
