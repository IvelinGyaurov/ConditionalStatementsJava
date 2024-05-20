package ConditionalStatementDay4;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countFilms = Integer.parseInt(scanner.nextLine());
        String highestMovieName = "";
        String lowestMovieName = "";
        double highestRating = 0;
        double lowestRating = 10;
        double ratingSum = 0;
        for (int i = 1; i <= countFilms ; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            ratingSum += rating;

            if (rating > highestRating){
                highestRating = rating;
                highestMovieName = movieName;
            }
            if (rating < lowestRating){
                lowestRating = rating;
                lowestMovieName = movieName;
            }

        }
        double averageRating = ratingSum / countFilms;

        System.out.printf("%s is with highest rating: %.1f%n",highestMovieName,highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n",lowestMovieName,lowestRating);
        System.out.printf("Average rating: %.1f",averageRating);
    }
}
