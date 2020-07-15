package main;

import java.util.Scanner;

public class AirlineReservation {
    private int choice;
    private boolean[] seatAvailability;
    Scanner sc = new Scanner(System.in);

    public AirlineReservation(int capacityValue) {
        seatAvailability = new boolean[capacityValue + 1];
    }

    public void firstClass() {
        for (int number = 1; number <= 5; number++) {
            if (seatAvailability[number] == false) {
                seatAvailability[number] = true;
                System.out.println("You have booked a first class seat");
                System.out.printf("Your seat number is %d%n", number);
                break;
            }
            if (seatAvailability[5] == true && seatAvailability[10] == true) {
                System.out.println("The flight is filled. Check back int the next 3 hours.");
                System.exit(0);
            }
            if (seatAvailability[5] == true) {
                System.out.println("The first class is filled. Would you like to go for the economy class? Enter 1 for Yes, 2 for No:");
                choice = sc.nextInt();
                if (choice == 1) {
                    economyClass();
                } else {
                    System.exit(0);
                }
            }
        }
    }

    public void economyClass() {
        for (int number = 6; number <= 10; number++) {
            if (seatAvailability[number] == false) {
                seatAvailability[number] = true;
                System.out.println("You have booked an economy class seat.");
                System.out.printf("Your seat number is %d%n", number);
                break;
            }
            if (seatAvailability[10] == true && seatAvailability[5] == true) {
                System.out.println("The flight is filled. Check back in the next three hours.");
                System.exit(0);
            }
            if (seatAvailability[10] == true) {
                System.out.println("The economy class is filled. Would you like to go for the first class? Enter 1 for Yes, 2 for No, any other number to exit: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    firstClass();
                } else {
                    System.exit(0);
                }
            }
        }
    }
}


