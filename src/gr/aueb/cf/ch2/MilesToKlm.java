package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert miles to km.
 */

public class MilesToKlm {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        final double KM_TO_MILE = 1.60934;
        double km= 0.0;
        double miles= 0.0;

        System.out.println("Please insert the miles");
        miles= scanner.nextDouble();
        km= miles* KM_TO_MILE;

        System.out.println("Miles: " + miles + ", Km: " + km);



    }}