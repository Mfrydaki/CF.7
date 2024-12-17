package gr.aueb.cf.ch3;

import java.util.Scanner;

//* Convert fahrenheit to celsius*/

public class FahrenheitToC {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int f=0;
        int c=0;

        System.out.println("Please insert the temperature");
        c= scanner.nextInt();
        c= 5 * (f-32)/9;

        System.out.println(" The temperature in celsius is :"+c);




    }
}
