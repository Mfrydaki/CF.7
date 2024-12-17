package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Snowing if raining AND temp < 0
 */
public class SnowingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean raining = false;
        boolean snowing = false;

        System.out.println("Please insert if is raining");
        raining = scanner.nextBoolean();

        System.out.println("Please insert the temperature");
        temp = scanner.nextInt();

        snowing = (temp < 0) && raining;
        System.out.println("Is snowing:"+snowing);

    }}