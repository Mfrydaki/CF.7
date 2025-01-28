package gr.aueb.cf.Projects;

import java.util.Scanner;

public class Project5 {

    //Create a 2D array to represent the theater seats
    static boolean[][] seats = new boolean[30][12];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Print Menu
            System.out.println("Choose an option:");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 3) {
                System.out.println("Goodbye!");
                break; // Exit
            }

            // Get column method
            System.out.print("Insert column (A-L): ");
            char column = scanner.nextLine().toUpperCase().charAt(0);
            if (column < 'A' || column > 'L') {
                System.out.println("Invalid column. Please try again.");
                continue;
            }

            // Get row method
            System.out.print("Insert row (1-30): ");
            int row = scanner.nextInt();
            if (row < 1 || row > 30) {
                System.out.println("Invalid row. Please try again.");
                continue;
            }

           // Conversion to array indices
            int columnIndex = column - 'A';
            int rowIndex = row - 1;

            if (choice == 1) {
                // Check if the seat is already booked
                if (seats[rowIndex][columnIndex]) {
                    System.out.println("This seat is already booked.");
                } else {
                    // Mark the seat as booked
                    seats[rowIndex][columnIndex] = true;
                    System.out.println("Booking of seat at Row: " + row + " Column: " + column + " was successful.");
                }
            }
             else if (choice == 2) {
                if (!seats[rowIndex][columnIndex]) {
                    System.out.println("This seat is not booked yet.");
                } else {
                    seats[rowIndex][columnIndex] = false;
                    System.out.println("Cancellation of seat at Row: " + row + " Column: " + column + " was successful.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}