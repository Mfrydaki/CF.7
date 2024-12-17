package gr.aueb.cf.ch3;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark.
 */
public class LightsOn {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        boolean isDark=false;
        boolean isRaining=false;
        boolean isCarRunning=false;
        boolean areLightsOn=false;
        int speed;
        final int MAX_SPEED=100;


        System.out.println("Please let me know, is it dark?");
        isDark=scanner.nextBoolean();

        System.out.println("Please let me know if is it raining?");
        isRaining=scanner.nextBoolean();

        System.out.println("Please let me know the speed of the car");
        speed= scanner.nextInt();

        isCarRunning= speed > MAX_SPEED;
        areLightsOn= isCarRunning ||isDark && isRaining;

        System.out.println(" The lights are on: "+ areLightsOn);
    }
}
