package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά, δευτερόλεπτα,
 * σε συνολικά δευτερόλεπτα. Ο χρήστης δίνει τα
 * δεδομένα και εκτυπώνεται το τελικό αποτέλεσμα.
 */
public class DateTimeToSecondsConverter {
    public static void main(String[] args) {

       final int Sec_per_day=3600*24;
       final int Sec_per_hour=3600;
       final int Sec_per_minute=60;

       Scanner in= new Scanner(System.in);
        int days;
        int hours;
        int min;
        int sec;
        int Total_sec=0;

        System.out.println("Please insert days,hours,minutes and seconds");
        days=in.nextInt();
        hours=in.nextInt();
        min=in.nextInt();
        sec=in.nextInt();

    Total_sec = days* Sec_per_day + hours * Sec_per_hour + min *Sec_per_minute+ sec;
    System.out.printf(Locale.US, "Total_sec: %,d,sec\n", Total_sec);




    }

}
