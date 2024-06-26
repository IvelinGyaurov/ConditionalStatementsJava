package ConditionalStatementDay4;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String movieName = scanner.nextLine();
        String typeRoom = scanner.nextLine();
        int countBoughtTickets = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (movieName){
            case "A Star Is Born":
                if (typeRoom.equals("normal")){
                    price = 7.50;
                } else if (typeRoom.equals("luxury")){
                    price = 10.50;
                } else if (typeRoom.equals("ultra luxury")){
                    price = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (typeRoom.equals("normal")){
                    price = 7.35;
                } else if (typeRoom.equals("luxury")){
                    price = 9.45;
                } else if (typeRoom.equals("ultra luxury")){
                    price = 12.75;
                }
                break;
            case "Green Book":
                if (typeRoom.equals("normal")){
                    price = 8.15;
                } else if (typeRoom.equals("luxury")){
                    price = 10.25;
                } else if (typeRoom.equals("ultra luxury")){
                    price = 13.25;
                }
                break;
            case "The Favourite":
                if (typeRoom.equals("normal")){
                    price = 8.75;
                } else if (typeRoom.equals("luxury")){
                    price = 11.55;
                } else if (typeRoom.equals("ultra luxury")){
                    price = 13.95;
                }
                break;
        }

        double totalSum = price * countBoughtTickets;
        System.out.printf("%s -> %.2f lv.",movieName,totalSum);
    }
}
