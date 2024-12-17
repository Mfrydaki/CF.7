package gr.aueb.cf.ch3;
/** Υπολογίζει το γινόμενο n αριθμών*/

import java.util.Scanner;

public class MullNApp {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int i=1;
        int mull=1;
        int n =0;

        System.out.println("Please insert a n");
        n=scanner.nextInt();

        while ( i <= n ){
            mull *=i;
            i++;
        }
        System.out.println("The result is "+mull);




        }

    }


