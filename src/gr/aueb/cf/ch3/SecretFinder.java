package gr.aueb.cf.ch3;

import java.util.Scanner;
public class SecretFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        final int secret = 10;
        boolean success = false;

        do {
            System.out.println("Please insert a number...");
            i = scanner.nextInt();

            if (i == secret) {
                System.out.println("Bravo Secret Found!");
                success = true;
            } else {
                System.out.println("Please Try again!");
            }
        }
         while ( !success );

        }
    }