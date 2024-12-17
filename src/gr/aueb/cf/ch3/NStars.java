package gr.aueb.cf.ch3;

/** Αναπτύξτε πέντε προγράμματα αντίστοιχα με τα προηγούμενα όπου ο χρήστης θα δίνει το πλήθος
 των stars, έστω n
 – n οριζόντια αστεράκια,
 – n κάθετα,
 – nxn,
 – από 1 έως n,
 – από n έως 1 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class NStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int i = 1;

        System.out.println("Please insert a number of stars.");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number should not be negative or zero. ");
            System.exit(1);}

        //Horizontally
        System.out.println("Horizontal Stars");
        for (i = 1; i <= n; i++) {
            System.out.print("*");}

        //Vertically

        System.out.println("Vertical Stars");
        for (i = 1; i <= n; i++) {
            System.out.println("*");}

        //NxM Grind
        System.out.println("N x M Stars");
        for (i = 1; i <= n; i++) {
            for  (int   j = 1; j <= n; j++) {
                System.out.print("*");}}
    }
}