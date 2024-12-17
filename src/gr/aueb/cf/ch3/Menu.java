package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
         int i=0;

         do {
             System.out.println("Επιλέξτε ένα απτά παρακάτω: ");
             System.out.println("1.Εισαγωγή");
             System.out.println("2.Διαγραφή");
             System.out.println("3.Ενημέρωση");
             System.out.println("4.Αναζήτηση");
             System.out.println("5.Έξοδος");
             System.out.print("Δώστε εντολή.");

             i= scanner.nextInt();

          if (i <=0 || i >=6)
          {
              System.out.print("Λάθος εισαγωγή");
              continue;
          }

          if (i!=5){
             if (i==1) {
                 System.out.println("Εισαγωγή");
             } else if ( i ==2 ) {
                 System.out.println("Διαγαρφή");
             }   else if ( i==3 ) {
                 System.out.println("Ενημέρωση");
             }   else { //επιλογή 4
                 System.out.println("Αναζήτηση");

             }           }
                 }
          while (i !=5);
             }

         }




