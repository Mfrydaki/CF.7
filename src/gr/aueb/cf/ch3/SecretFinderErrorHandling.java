package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) throws Exception {


        int i=0;
        final int secret =10;
        boolean success = false;
        Scanner scanner= new Scanner(System.in);

        while (true) {
            System.out.println("Please insert a number");
            i = scanner.nextInt();


            if (i != secret) {
                System.out.println("Please try again");
                continue;

            } else {
                System.out.println("Secret number found");
                break;
            }
        }





    }
}
