package gr.aueb.cf.ch3;

/* Εμφανίζει τον πολλαπλασιαμό ενός ακεραίου
που δίνει ο χρήστης, με όλους τους ακεραίους από 1-10
 */
import java.util.Enumeration;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num=0;
        int i=1;


        System.out.println("Please insert an integer");
        num =scanner.nextInt();

        while (i<=10) {
            System.out.println(num + "*" +i + "=" + (num * i));
            i++;}
        }





        }

