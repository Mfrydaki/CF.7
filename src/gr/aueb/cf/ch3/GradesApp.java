package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Ο χρήστης θα δίνει
 * 1. τους βαθμούς μαθημάτων του
 * 2.τον αριθμό μαθημάτων του
 *
 * Θα υπολογίζει τον μέσο όρο και θα χαρακτηρίζει:
 * "Άριστα" αν ο μ.όρος >=9, "Πολύ καλά" αν ο μ.όρος είναι >=7 και "Καλώς" αν ο μ.'ορος >=5 και "Αποτυχία" για <5
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int courses = 1; //αριθμός μαθημάτων
        int grade = 0; //συνολικός αριθμός βαθμών
        int avg = 0; // μέσος όρος βαθμών

        System.out.println("Please insert the number of courses." );
        courses= scanner.nextInt();

        if (courses <=0 ){
            System.out.println("The number should not be zero or negative.");
            System.exit(1);
        }
        System.out.println("Please insert your grades.");
        grade= scanner.nextInt();

        avg=grade/courses;
        if(avg>=9){
            System.out.println("Excellent.");
            System.exit(1);}
        else if(avg >= 7){
            System.out.println("Very good.");
            System.exit(1);
            }
        else if(avg>=5) {
            System.out.println("Good.");
            System.exit(1);
            }
        else {
                System.out.println(" Failure.");





            }
        }

    }