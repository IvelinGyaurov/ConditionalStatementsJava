package ConditionalStatementDay4;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String country = scanner.nextLine();
        String device = scanner.nextLine();

        double harnessRating = 0;
        double performanceRating = 0;

        switch (device){
            case "ribbon":
                if (country.equals("Russia")){
                    harnessRating += 9.100;
                    performanceRating += 9.400;
                } else if (country.equals("Bulgaria")){
                    harnessRating += 9.600;
                    performanceRating += 9.400;
                } else if (country.equals("Italy")){
                    harnessRating += 9.200;
                    performanceRating += 9.500;
                }
                break;
            case "hoop":
                if (country.equals("Russia")){
                    harnessRating += 9.300;
                    performanceRating += 9.800;
                } else if (country.equals("Bulgaria")){
                    harnessRating += 9.550;
                    performanceRating += 9.750;
                } else if (country.equals("Italy")){
                    harnessRating += 9.450;
                    performanceRating += 9.350;
                }
                break;
            case "rope":
                if (country.equals("Russia")){
                    harnessRating += 9.600;
                    performanceRating += 9.000;
                } else if (country.equals("Bulgaria")){
                    harnessRating += 9.500;
                    performanceRating += 9.400;
                } else if (country.equals("Italy")){
                    harnessRating += 9.700;
                    performanceRating += 9.150;
                }
                break;
        }
        double totalRating = harnessRating + performanceRating;
        double total = 20 - totalRating;
        double sum = (total / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n",country,totalRating,device);
        System.out.printf("%.2f%%",sum);
    }
}
