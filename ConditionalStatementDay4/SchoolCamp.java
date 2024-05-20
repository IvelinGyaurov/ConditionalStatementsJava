package ConditionalStatementDay4;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        String type = scanner.nextLine();
        int countStudents  = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceForHotel = 0;
        String typeSport = "";

        if (season.equals("Winter")){
            if (type.equals("boys")){
                priceForHotel = countNights * countStudents * 9.60;
                typeSport = "Judo";
            }else if (type.equals("girls")){
                priceForHotel = countNights * countStudents *  9.60;
                typeSport = "Gymnastics";
            } else if (type.equals("mixed")){
                priceForHotel = countNights * countStudents * 10;
                typeSport = "Ski";
            }
        } else if (season.equals("Spring")){
            if (type.equals("boys") ){
                priceForHotel = countNights * countStudents * 7.20;
                typeSport = "Tennis";
            }else if (type.equals("girls")){
                priceForHotel = countNights * countStudents * 7.20;
                typeSport = "Athletics";
            } else if (type.equals("mixed")){
                priceForHotel = countNights * countStudents * 9.50;
                typeSport = "Cycling";
            }
        } else if (season.equals("Summer")){
            if (type.equals("boys")){
                priceForHotel = countNights * countStudents * 15.0;
                typeSport = "Football";
            }else if (type.equals("girls")){
                priceForHotel = countNights * countStudents * 15.0;
                typeSport = "Volleyball";
            } else if (type.equals("mixed")){
                priceForHotel = countNights * countStudents * 20.0;
                typeSport = "Swimming";
            }
        }
        if (countStudents >= 10 && countStudents < 20){
            priceForHotel = priceForHotel * 0.95;
        } else if ( countStudents >= 20 && countStudents < 50){
            priceForHotel = priceForHotel * 0.85;
        } else if (countStudents >= 50){
            priceForHotel = priceForHotel * 0.50;
        }

        System.out.printf("%s %.2f lv.",typeSport , priceForHotel);
    }
}
