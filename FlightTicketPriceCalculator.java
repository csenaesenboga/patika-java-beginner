//Takes input as age, distance and trip type,
//Calculates ticket price using distance, fare and trip type,
//Applies discounts according to age and trip type,
//Prevents false input by asking until the input is valid.

import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {
        int age, distance, tripType; //number ,KM, one-way or return
        double fare = 0.1; //per KM
        double ticketPrice;

        Scanner s = new Scanner(System.in);

        //Ask the distance and trip type. Ask until the input is valid.
        System.out.print("Enter the distance: ");
        distance = s.nextInt();

        //Prevent false input
        while (distance < 0){
            System.out.println("Invalid distance. Please enter a positive number.");
            distance = s.nextInt();
        }

        System.out.println("Is it one-way or return?\nPress 1 for One-way, 2 for Return");
        tripType = s.nextInt();

        //Prevent false input
        while (tripType != 1 && tripType !=2){
            System.out.println("Invalid trip type. Please enter 1 or 2.");
            tripType = s.nextInt();
        }

        ticketPrice = distance * fare * tripType;

        //Take age as a discount condition
        System.out.println("Enter your age (for discount calculation): ");
        age = s.nextInt();

        //Prevent false input
        while (age < 0){
            System.out.println("Invalid age. Please enter a positive number.");
            age = s.nextInt();
        }

        //Apply discounts
        if(age < 12) ticketPrice = ticketPrice*50/100;

        else if(age <24) ticketPrice = ticketPrice*90/100;

        if(age > 65) ticketPrice = ticketPrice*70/100;

        if(tripType == 2) ticketPrice = ticketPrice*80/100;

        //Print the ticket price after discounts
        System.out.println("Ticket price: " + ticketPrice);

    }
}
