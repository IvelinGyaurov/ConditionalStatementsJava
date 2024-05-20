package ConditionalStatementDay4;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number ; i++) {
            for (int j = number; j <= number2 ; j++) {
                System.out.println(i + j);
            }
        }

    }
}
