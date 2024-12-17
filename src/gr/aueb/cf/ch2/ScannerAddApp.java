package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two integers from the
 * std input (keyboard) and calculates the result.
*/

public class ScannerAddApp {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int num1=0;
        int num2=0;
        int sum= 0;

        System.out.println("Please insert two integers");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum= num1+num2;



        System.out.printf("The result of %d and %d is %d", num1, num2, sum);



    }
}