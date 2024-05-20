package ConditionalStatementDay4;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuetPrice = rent * 0.70;
        double cateringPrice = statuetPrice * 0.85;
        double soundPrice = cateringPrice / 2;

        double totalSum = rent + statuetPrice + cateringPrice + soundPrice;
        System.out.printf("%.2f",totalSum);
    }
}
