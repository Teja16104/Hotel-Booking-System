package Basics;

import java.util.*;

class HotelBooking {

    public static void main(String[] args) {

        System.out.println("Welcome to TajTej Hotel !!");

        Scanner sc = new Scanner(System.in);

        String continueBooking = "";

        double totalAcCost = 0;
        double totalNonAcCost = 0;

        do {

            System.out.println("\nEnter Room Category:");
            System.out.println("AC / Non-AC");

            String roomCategory = sc.next().toLowerCase();

            switch (roomCategory) {

                case "ac":

                    String continueAcBooking = "";

                    do {

                        System.out.println("\nAvailable AC Rooms:");
                        System.out.println("Enter Room Type:");
                        System.out.println("Deluxe - 3000/-");
                        System.out.println("Suite - 5000/-");
                        System.out.println("Premium - 4000/-");

                        String roomType = sc.next().toLowerCase();

                        switch (roomType) {

                            case "deluxe":

                                System.out.println("Deluxe AC Room - 3000/-");

                                double deluxeRoomCost = 3000;
                                totalAcCost += deluxeRoomCost;

                                break;

                            case "suite":

                                System.out.println("Suite AC Room - 5000/-");

                                double suiteRoomCost = 5000;
                                totalAcCost += suiteRoomCost;

                                break;

                            case "premium":

                                System.out.println("Premium AC Room - 4000/-");

                                double premiumRoomCost = 4000;
                                totalAcCost += premiumRoomCost;

                                break;

                            default:

                                System.out.println("Room not available !!");
                        }

                        System.out.println("Do you want to continue with AC Rooms? Y/N");
                        continueAcBooking = sc.next();

                    } while (continueAcBooking.equalsIgnoreCase("y"));

                    System.out.println("Total AC Room Cost is : " + totalAcCost);

                    break;

                case "non-ac":

                    String continueNonAcBooking = "";

                    do {

                        System.out.println("\nAvailable Non-AC Rooms:");
                        System.out.println("Enter Room Type:");
                        System.out.println("Standard - 1500/-");
                        System.out.println("Single - 1000/-");
                        System.out.println("Double - 2000/-");

                        String roomType = sc.next().toLowerCase();

                        switch (roomType) {

                            case "standard":

                                System.out.println("Standard Non-AC Room - 1500/-");

                                double standardRoomCost = 1500;
                                totalNonAcCost += standardRoomCost;

                                break;

                            case "single":

                                System.out.println("Single Non-AC Room - 1000/-");

                                double singleRoomCost = 1000;
                                totalNonAcCost += singleRoomCost;

                                break;

                            case "double":

                                System.out.println("Double Non-AC Room - 2000/-");

                                double doubleRoomCost = 2000;
                                totalNonAcCost += doubleRoomCost;

                                break;

                            default:

                                System.out.println("Room not available !!");
                        }

                        System.out.println("Do you want to continue with Non-AC Rooms? Y/N");
                        continueNonAcBooking = sc.next();

                    } while (continueNonAcBooking.equalsIgnoreCase("y"));

                    System.out.println("Total Non-AC Room Cost is : " + totalNonAcCost);

                    break;

                default:

                    System.out.println("Room Category not available !!");
            }

            System.out.println("\nDo you want to continue with other categories? Y/N");
            continueBooking = sc.next();

        } while (continueBooking.equalsIgnoreCase("y"));

        System.out.println("\n========== HOTEL BILL ==========");

        System.out.println("Total AC Room Cost : " + totalAcCost);

        System.out.println("Total Non-AC Room Cost : " + totalNonAcCost);

        System.out.println("Total Bill : " + (totalAcCost + totalNonAcCost));

        System.out.println("Thank you for visiting TajTej Hotel !!");

        sc.close();
    }
}
