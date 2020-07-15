package main;

import java.util.Scanner;
public class AirlineReservationTest {
    public static void main(String[] args) {
        AirlineReservation airline = new AirlineReservation(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for first class, 2 for economy class and any other number to exit: ");

        int classChoice = sc.nextInt();

        while(classChoice==1 || classChoice==2){
            if(classChoice==1){
                airline.firstClass();
            }
            else{
                airline.economyClass();
            }
            System.out.println("Enter 1 for first class, 2 for economy class and any other number to exit: ");
            classChoice = sc.nextInt();
        }
    }
}

